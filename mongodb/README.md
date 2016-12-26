
mongodb config and documents 

### Run mongo db server on default port

MongoDB port=27017

use DB "test" and create documents "event"


### use mongo client to check DB connections 

>mongo
MongoDB shell version: 3.2.10
connecting to: test
> show dbs
local  0.000GB
test   0.000GB
> use test
switched to db test
> show collections
event
> db.event.find()
{ "_id" : ObjectId("58603abb142e5e3158c1d801"), "_class" : "com.history.model.Event", "when" : ISODate("2016-12-25T21:31:39.941Z"), "where" : "Richmond", "what" : "war" }
{ "_id" : ObjectId("58603abb142e5e3158c1d802"), "_class" : "com.history.model.Event", "when" : ISODate("2016-12-25T21:31:39.941Z"), "where" : "Colorado", "what" : "move in" }
>