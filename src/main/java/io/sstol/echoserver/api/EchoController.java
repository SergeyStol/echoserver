package io.sstol.echoserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Stol
 * 2022-05-29
 */
@RestController
public class EchoController {
    @GetMapping
    String echo(@RequestBody String message) {
        return message;
    }
}
