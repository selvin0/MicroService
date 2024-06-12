HTTP Status code & Messages:
----------------------------
-> when client sends http requet to server, it will proess that request 
   and it will send response back to client with status code, status
   messages,headers & response body.
   
   status-code    status-msg     protocol-version
   
 -> HTTP status codes are divided into 5 categories.
 
   1**  (100-199): Information (information details about request and response)
   2**  (200-299): sucecess(proess sucecess)
   3**  (300-399): Redirectional
   4**  (400-499): Client error(url is incorrect,request data is incorrect)
   5**  (500-599): server error(nullPointerException error,ArrayIndexOutOfBound
                                occurs,the is not proberly execute)
								
404 & 500 status code.

404  -client error 
500  -server error   Exception error in our code it's return 500 because server 
      problem.

@ResponseStatus to Set HTTP Status Code  --- study that

405 ---> that method is get method your hitting endPoint post it's 
         showing 405(method not allowed)
		 
how to tell to server i want xml format.

accept    application/xml
key        value

406 ------>not acceptable error 

a method only produce json if i trying to get xml format data it's showing
406 error.

a method only consumes json your trying to post your data it's showing
415 Unsupported Media Type.(client error)

-> 200 ok

-> 201 Created

-> 204 No Content

-> 400 BAD Request

-> 404 Not Found

-> 405 Method Not Allowed

-> 406 Not Acceptable

-> 415 Unsupported Media Type

-> 500 Internal server Error

























