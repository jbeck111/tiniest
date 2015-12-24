# migrate-h2-from-run-args

Migrate (i.e. make / alter) an h2 database.  
Implemented within the app's source code.  
When the app is run, it takes an argument of "migrate" or "rollback".  

## Usage

Put migration instructions in /migrations.  
They are sql statements.  
More details at https://github.com/yogthos/migratus  

In the project root folder, type "lein run migrate" or "lein run rollback".

The resulting database will be in a /db folder.

## Origins

https://github.com/yogthos/migratus

## Taking it further

To also take a numeric arg in order to specify particular migration or rollback
by its item number, see migrations.clj file in luminus guestbook example,
https://github.com/luminus-framework/guestbook/tree/master/src/guestbook/db
