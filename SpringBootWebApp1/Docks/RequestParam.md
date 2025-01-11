# Request Param and Https Session 

```
// Using the Spring way of Request Param :

    @RequestMapping("/add")
    //public String add(int num1, int num2, HttpSession session) {

    // requesting the actual var in the num and num2 using the RequestParam
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session) {
//        int result = num1 + num2 +2;
int result = num + num2;
// session
session.setAttribute("result", result);
return "result";
```