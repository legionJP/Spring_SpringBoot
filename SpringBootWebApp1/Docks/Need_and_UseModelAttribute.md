
# Need for the model Attribute 

- If we have the multiple data object like myID and myName than we need 
- to adjust the usages of below files 
# Part 1 Model View 

```
// Method for the addMe
@RequestMapping("addMe")
public ModelAndView addMe(@RequestParam("myID") int myID,  @RequestParam("myName") String myName, ModelAndView mv)
{
MyInfo myInfo = new MyInfo();
myInfo.setMyID(myID);
myInfo.setMyName(myName);

        mv.addObject("myInfo", myInfo);
        mv.setViewName("myInfo");
        return mv;
    }
}
```

# part 2: Need for Model Attribute
```
// 2. Model attribute for the different name of obj MyInfo
//        @RequestMapping("addMe")
//        public String addMe(@ModelAttribute MyInfo myInfo)  // @ModelAttribute is responsible for assigning the value to objs
//        public String addMe(@ModelAttribute("myInfo1") MyInfo myInfo)
//        {
//            // No need to Implement these
////            MyInfo myInfo = new MyInfo();
////            myInfo.setMyID(myID);
////            myInfo.setMyName(myName);
////
////            mv.addObject("myInfo", myInfo);
////            mv.setViewName("myInfo");
//                return "myInfo";
```

# Part 3 Use of the Model Attribute 
```
// 2. Model attribute for the same name of obj MyInfo , and the @ModelAttribute is optional
    
    //2.1 Model Attribute :

    @ModelAttribute("course")
        public String coursename()
    {
    return "Java";
    }

        @RequestMapping("addMe")
        public String addMe(MyInfo myInfo)  // here it will work without the model attribute behind the scene
        {
            return "myInfo";
        }

```