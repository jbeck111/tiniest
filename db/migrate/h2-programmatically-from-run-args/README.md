# migrate-h2-programmatically-from-run-args

Migrate (i.e. make / alter) an h2 database.  
Programmed within the app's source code.  
Taking a simple run argument of "migrate" or "rollback".  

## Usage

Migration sql statements go in /migrations.
Styled as per the instructions at https://github.com/yogthos/migratus

In the project root folder, type "lein run migrate" or "lein run rollback".

The resulting database will be in a /db folder.

## Origins

https://github.com/yogthos/migratus
https://github.com/yogthos/migratus-lein

## Taking it further

To take yet another arg in order to specify particular migration or rollback
by its item number, see migrations.clj file in luminus guestbook example,
https://github.com/luminus-framework/guestbook/tree/master/src/guestbook/db
