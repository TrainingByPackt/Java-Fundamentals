#!/bin/bash -e

# Compile everything
./gradlew compile

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

pushd build > /dev/null
pushd compiled > /dev/null

declare -a lessons=("Lesson04" "Lesson05" "Lesson06" "Lesson07")
declare -a directories=("Activity" "Exercise" "Snippet")

for lesson in "${lessons[@]}"; do
    pushd $lesson > /dev/null
    for dirToFind in "${directories[@]}"; do
        for dir in $(find . -name "*$dirToFind*" -type d); do
            CLASSPATH=$CLASSPATH:build/compiled/$lesson/$dir
        done
    done
    popd > /dev/null
done

popd > /dev/null
popd > /dev/null

echo $CLASSPATH
USERS_FILE=Lesson07/data/users.csv

execute_class() {
    echo "-- Executing $1 --"
    if [[ -z $2 ]]; then
        java -cp $CLASSPATH $1 $USERS_FILE
    else
        echo "$2" | java -cp $CLASSPATH $1 $USERS_FILE
    fi
    echo "------------------"
}

execute_class_with_args() {
    echo "-- Executing $1 --"
    java -cp $CLASSPATH $*
    echo "------------------"
}

# Download adult.data if not present
if [ ! -f $DIR/adult.data ]; then
    curl -o $DIR/adult.data https://archive.ics.uci.edu/ml/machine-learning-databases/adult/adult.data
fi

# Run one class
if [[ $# -gt 1 && "$1" -eq "class" ]]; then
    shift
    execute_class_with_args $*
fi

# Lesson 04
if [[ $# -eq 0 || "$1" -eq "4" ]]; then
    execute_class_with_args Calculator
    execute_class_with_args CalculatorWithFixedOperators
fi

# Lesson 05
if [[ $# -eq 0 || "$1" -eq "5" ]]; then
    execute_class_with_args ShowSalaryAndCommission
    execute_class_with_args UseAbstractClass
    # execute_class_with_args UseInterfaces
fi

# Lesson 06
if [[ $# -eq 0 || "$1" -eq "6" ]]; then
    execute_class_with_args CalculatorWithDynamicOperator
fi

# Lesson 07
if [[ $# -eq 0 || "$1" -eq "7" ]]; then
    execute_class AddAndFetch
    execute_class AddAndFetchWithGenerics
    execute_class ComparingStrings
    execute_class FindByStringWithGenerics randomstring
    execute_class FindByStringWithGenerics will
    execute_class FindUserHashtable randomstring
    execute_class FindUserHashtable william.gates@microsoft.com
    execute_class IncreaseOnEachRead
    execute_class IterateOnUsersVector
    execute_class IteratingOnArrays
    execute_class IteratingOnVector
    execute_class ReadCSVFile
    execute_class ReadUsersIntoVector
    execute_class SendAllEmails
    execute_class SortUsers address
    execute_class SortUsers email
    execute_class SortUsers id
    execute_class SortUsers name
    execute_class SortUsersTreeSet address
    execute_class SortUsersTreeSet email
    execute_class SortUsersTreeSet id
    execute_class SortUsersTreeSet name
    execute_class UseAlphabeticComparator
    execute_class UseCSVReaderSample
    execute_class UseInitialCapacity
    execute_class UseIterableCSVReader
    execute_class_with_args CalculateAverageSalary $DIR/adult.data
    execute_class_with_args EmailSender william.gates@microsoft.com
    execute_class_with_args GroupWageByEducation $DIR/adult.data
fi