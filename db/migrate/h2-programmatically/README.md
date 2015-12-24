# migrate-h2-lein

Migrate (i.e. make / alter) an h2 database.

Within the app's source code. 

## Usage

Migration instructions (sql statements) go in /migrations.
Styled as per the instructions at https://github.com/yogthos/migratus

In the project root folder, enter the command "lein run".

The resulting database will be in a /db folder.

## Origins

https://github.com/yogthos/migratus
https://github.com/yogthos/migratus-lein
