### Depends On

- Lesson07/SharedClasses

### Sample Executions

```
class: SortUsers
args: Lesson07/data/users.csv
inputs: address
output:
10 unique users found.
What field you want to sort by: 
Sorry, invalid option: address
```

```
class: SortUsers
args: Lesson07/data/users.csv
inputs: email
output:
10 unique users found.
What field you want to sort by: 
Sorting by email
55 - Geisha Williams, geisha.williams@pgecorp.com
15 - Ginni Rometty, ginni.rometty@ibm.com
25 - Indra Nooyi, indra.nooyi@pepsico.com
30 - Jeff Bezos, jeff.bezos@amazon.com
20 - Marc Benioff, marc.benioff@salesforce.com
35 - Marillyn Hewson, marillyn.hewson@lockheedmartin.com
45 - Safra Catz, safra.catz@oracle.com
10 - Satya Nadella, satyam.nadella@microsoft.com
40 - Sundar Pichai, sundar.pichai@google.com
50 - Tim Cook, timothy.cook@apple.com
```

```
class: SortUsers
args: Lesson07/data/users.csv
inputs: id
output:
10 unique users found.
What field you want to sort by: 
Sorting by id
10 - Satya Nadella, satyam.nadella@microsoft.com
15 - Ginni Rometty, ginni.rometty@ibm.com
20 - Marc Benioff, marc.benioff@salesforce.com
25 - Indra Nooyi, indra.nooyi@pepsico.com
30 - Jeff Bezos, jeff.bezos@amazon.com
35 - Marillyn Hewson, marillyn.hewson@lockheedmartin.com
40 - Sundar Pichai, sundar.pichai@google.com
45 - Safra Catz, safra.catz@oracle.com
50 - Tim Cook, timothy.cook@apple.com
55 - Geisha Williams, geisha.williams@pgecorp.com
```

```
class: SortUsers
args: Lesson07/data/users.csv
inputs: name
output:
10 unique users found.
What field you want to sort by: 
Sorting by name
55 - Geisha Williams, geisha.williams@pgecorp.com
15 - Ginni Rometty, ginni.rometty@ibm.com
25 - Indra Nooyi, indra.nooyi@pepsico.com
30 - Jeff Bezos, jeff.bezos@amazon.com
20 - Marc Benioff, marc.benioff@salesforce.com
35 - Marillyn Hewson, marillyn.hewson@lockheedmartin.com
45 - Safra Catz, safra.catz@oracle.com
10 - Satya Nadella, satyam.nadella@microsoft.com
40 - Sundar Pichai, sundar.pichai@google.com
50 - Tim Cook, timothy.cook@apple.com
```