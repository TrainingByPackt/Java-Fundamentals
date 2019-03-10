### Depends On

- Lesson07/SharedClasses

### Sample Executions

```
class: FindUserHashtable
args: Lesson07/data/users.csv
inputs: randomstring

output:
Loaded 10 unique users.
Type a user email: 
Sorry, user with email randomstring not found.
```

```
class: FindUserHashtable
args: Lesson07/data/users.csv
inputs: geisha.williams@pgecorp.com

output:
Loaded 10 unique users.
Type a user email: 
User with email 'geisha.williams@pgecorp.com' found! ID: 55, Name: Geisha Williams
```