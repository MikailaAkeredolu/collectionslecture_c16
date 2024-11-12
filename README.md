# Twitter Internship Day 1

## Requirements
- Limit user's character input for social media handle to 9 characters
- if handle is 9 characters or more then use it but include an @ symbol in front of it
- if it's more than 9 characters cut off the rest and use it
- All handles should be in lowercase

### Test cases
 - createHandleTest()  ***To check if a social media handle was created successfully***
 - checkHandleLessThan9CharactersTest() ***To check if handle was created with 9 characters or less***
-  checkEmptyOrBlankCharactersTest ***To check if social media handle is empty or blank***
-  addHandleTest - ***To check if handle was added once despite multiple attempts***
-  removeHandleTest() ***To check if handle was removed successfully***
-  void checkIfNullTest() ***To check if social media handle input is null***
   

```
public class SocialHandle  {

    HashSet<String> listOfHandles = new HashSet<>();
 

    public String createHandle(String yourSocialHandle) {

      
       return null;
    }


    public void addHandle(String yourSocialHandle){


    }


    public void removeHandle(String yourSocialHandle){

    }



    public HashSet<String> getHandles() {
        return listOfHandles;
    }

}
```
