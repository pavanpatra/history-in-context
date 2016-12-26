\project\springboot\history\src\test\postman>newman run History_in_context.postman_collection
newman

History in context

→ retrieve all events
  GET http://localhost:8080/events [200 OK, 309B, 1377ms]

→ insert new events
  POST http://localhost:8080/events [200 OK, 75B, 288ms]

→ remove all Events
  DELETE http://localhost:8080/events [200 OK, 75B, 32ms]

┌─────────────────────────┬──────────┬──────────┐
│                         │ executed │   failed │
├─────────────────────────┼──────────┼──────────┤
│              iterations │        1 │        0 │
├─────────────────────────┼──────────┼──────────┤
│                requests │        3 │        0 │
├─────────────────────────┼──────────┼──────────┤
│            test-scripts │        0 │        0 │
├─────────────────────────┼──────────┼──────────┤
│      prerequest-scripts │        0 │        0 │
├─────────────────────────┼──────────┼──────────┤
│              assertions │        0 │        0 │
├─────────────────────────┴──────────┴──────────┤
│ total run duration: 1764ms                    │
├───────────────────────────────────────────────┤
│ total data received: 179B (approx)            │
├───────────────────────────────────────────────┤
│ average response time: 565ms                  │
└───────────────────────────────────────────────┘