# migrate-h2-lein

Migrate (i.e. make / alter) an h2 database.  
Do it outside the app's source code. 

It is a lein plugin.  
So the guts of this code is found in the lein instruction file: project.clj  

## Usage

Put migration instructions in /migrations.  
They are sql statements.  
More details at https://github.com/yogthos/migratus  

In the project folder, enter the command
"lein migratus migrate"

The instructions will be carried out.

The resulting database will be in a /db folder.

## Origins

https://github.com/yogthos/migratus
https://github.com/yogthos/migratus-lein