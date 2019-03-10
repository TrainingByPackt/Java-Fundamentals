### Depends On

- Lesson07/SharedClasses

### Sample Executions

```
class: FindByStringWithGenerics
args: Lesson07/data/users.csv
inputs: randomstring

output:
Loaded 70 users.
Type a string to search for: 
No user found with string 'randomstring'
```

```
class: FindByStringWithGenerics
args: Lesson07/data/users.csv
inputs: will

output:
Loaded 70 users.
Type a string to search for: 
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found user: Geisha Williams Email: geisha.williams@pgecorp.com
Found 7 users with 'will'
```
