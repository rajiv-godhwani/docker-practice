package us.cogitate.hookcopy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by rgodhwani on 3/30/2017.
 * Copyright (2017) by Cogitate Technology Solution
 */
@Controller
public class HookCopy {

    @RequestMapping("/greeting")
    @ResponseBody
    public String onNewProject(@RequestParam String name) {
        return !"sports".equals(name) ? "Incorrect secret key.Try again!" : "Shabaaaaash!!!";
    }

}
