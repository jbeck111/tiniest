(ns app.core
	(:require
		[app.migrate :as migrate]
		[app.crud :as crud]))

(defn -main
	[]
	(migrate/make-db)
	(crud/add-example)
	(crud/read-example)
	(crud/update-example)
	(crud/delete-example)
	)
