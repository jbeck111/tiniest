(ns app.crud
	(	:require
		[clojure.java.jdbc :as j]
		[app.dbspec :refer [db-spec]]))

; ======== CREATE RECORDS ========

(defn add-func! [firstname]
	(j/insert! db-spec :person {:name firstname}))

(defn add!
	"Add a record, and while doing so, get its ID and print it."
	[firstname]

	; (add-func!) or (jdbc/insert!) returns a list () of maps {} {} {}
	; The list only has one item because we only inserted one item.
	; So it looks like this: ({:scope_identity() 26})

	; To get the first (and only) item in the list:
	; (first (add-func!))
	; Which looks like this: {:scope_identity() 26}

	; Apparently :scope_identity() is a database-specific label supplied by H2.
	; For example, MySQL instead calls it :generated_key
	; So if you can avoid referring to its keyword, the code is more portable.

	; To get the values of the map, without their labels:
	; (vals ... yields a list in the original sequence of the map

	; The list may have only one item. ID will be first i.e. (26)
	; Get this out of the list, and on its own: (first (vals
	; Putting that all together...

	;(let [firstname "Martha"]
	(println "About to add " firstname)
	(def returnval (first (vals (first (add-func! firstname)))))
	(println "The ID for " firstname " was " returnval))

(defn add-example []
	(add! "Wendy")
	(add! "Harry")
	(add! "Martha")
	(add! "Hank")
	)

; ======== READ RECORDS ========

(defn get-one-record [firstname]
	 (j/query db-spec ["select * from person where name = ?" firstname]))

(defn get-all-records []
	 (j/query db-spec ["select * from person order by id"]))

(defn print-one-record [firstname]
	(doseq [i (get-one-record firstname)]
		(println i)))

(defn print-all-records []
	(doseq [i (get-all-records)]
		(println i)))

(defn read-example []
	(println "\nResult of reading Martha: ")
	(print-one-record "Martha")

	(println "\nResult of reading all: ")
	(print-all-records)
	(println)
	)

; ======== UPDATE RECORDS ========

(defn update-record [oldname newname]
	(j/execute! db-spec ["update person set name = ? where name = ?" newname oldname]))


(defn update-example []
	(println "\nWill now change Harry to Jake: ")
	(update-record "Harry" "Jake")

	(println "\nNow let's read all records again: ")
	(print-all-records)
	(println)
	)


; ======== DELETE RECORDS ========

(defn delete-record [name]
	(j/execute! db-spec ["DELETE FROM person WHERE name = ?" name]))


(defn delete-example []
	(println "\nWill now delete Wendy and Hank: ")
	(delete-record "Wendy")
	(delete-record "Hank")

	(println "\nNow let's read all records again: ")
	(print-all-records)
	(println)
	)