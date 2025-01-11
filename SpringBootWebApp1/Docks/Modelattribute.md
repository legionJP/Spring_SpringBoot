# Model Interface to add data Attribute 

```
// Using the Model as Interface to transfer the data b/w the view and controller (use the JSTL for the view)

    @RequestMapping("/add")
    //public String add(int num1, int num2, HttpSession session) {
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2,  Model model) {
        int result = num + num2;
        // adding the data obj in model
        model.addAttribute("result", result);
        return "result";
```