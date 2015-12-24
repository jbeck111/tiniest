(ns app.core
	(:require [app.migrate :as migrate]))

(defn -main
	[]
	(migrate/make-db)
	)
