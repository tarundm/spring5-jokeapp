package guru.springframework.joke.jokeapp.controller;

import guru.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    // Autowiring JokeService - constructor based dependency injection
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    // @RequestMapping(method=RequestMethod.POST, value="/topics")
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        // THis is MVC model interacts with UI View.
        // model is ui component, add property name and value as service method.
        model.addAttribute("joke", jokeService.getJoke());

        // return the view name.
        // this view name automatically gets renamed with thymeleaf template.
        return "chucknorris";
    }
}
