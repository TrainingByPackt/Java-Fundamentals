#!/bin/bash -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# Lesson 04
CLASSPATH=$CLASSPATH:Lesson04/Activity001_Calculator/
CLASSPATH=$CLASSPATH:Lesson04/Activity001_Calculator_with_operator/

# Lesson 05
CLASSPATH=$CLASSPATH:Lesson05/Activity001_Create_and_use_interfaces/
CLASSPATH=$CLASSPATH:Lesson05/Activity001_Use_abstract_class/
CLASSPATH=$CLASSPATH:Lesson05/Activity001_Use_instance_of_and_casting/
CLASSPATH=$CLASSPATH:Lesson05/SharedClasses/

# Lesson 06
CLASSPATH=$CLASSPATH:Lesson06/Activity001_Calculator_dynamic_operator/
CLASSPATH=$CLASSPATH:Lesson06/Activity001_Calculator_final/

# Lesson 08
CLASSPATH=$CLASSPATH:Lesson08/Activity001_Array_with_initial_capacity/
CLASSPATH=$CLASSPATH:Lesson08/Activity001_Calculate_Average_Salary/
CLASSPATH=$CLASSPATH:Lesson08/Activity001_Group_wage_by_education/
CLASSPATH=$CLASSPATH:Lesson08/Activity001_Iterate_On_Vector/
CLASSPATH=$CLASSPATH:Lesson08/Activity001_Sorting_Users/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Array_increase_on_read/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Compare_Strings_Alphabetically/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Fake_email_sender/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Find_User_By_String/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Find_User_Hashtable/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Reading_Files/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Sorting_Users_TreeSet/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Vector/
CLASSPATH=$CLASSPATH:Lesson08/Exercise001_Write_A_CSVReader/
CLASSPATH=$CLASSPATH:Lesson08/SharedClasses/
CLASSPATH=$CLASSPATH:Lesson08/Snippet001_Comparable/
CLASSPATH=$CLASSPATH:Lesson08/Snippet001_Generics/
CLASSPATH=$CLASSPATH:Lesson08/Snippet001_Iterators_and_Iterable/
CLASSPATH=$CLASSPATH:Lesson08/Snippet001_Iterators_and_Iterable/

USERS_FILE=Lesson08/data/users.csv

echo "Deleting old class files..."
find . -name "*.class" -print0 | xargs -0 rm

echo "Compiling everything..."
find . -name "*.java" -print0 | xargs -0 javac -cp $CLASSPATH

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
if [[ "$1" -eq "class" ]]; then
    execute_class_with_args $2
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
    execute_class_with_args UseInterfaces
fi

# Lesson 06
if [[ $# -eq 0 || "$1" -eq "6" ]]; then
    execute_class_with_args CalculatorWithDynamicOperator
fi

# Lesson 08
if [[ $# -eq 0 || "$1" -eq "8" ]]; then
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