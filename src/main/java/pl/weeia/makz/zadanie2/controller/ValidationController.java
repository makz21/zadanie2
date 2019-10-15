package pl.weeia.makz.zadanie2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.weeia.makz.zadanie2.utils.ValidateUtils;

import static pl.weeia.makz.zadanie2.utils.ValidateUtils.validateString;

/**
 * Rest controller for validate string
 */
@RestController
public class ValidationController {

    /**
     * Method to validate string
     *
     * @param stringToValidate string to validate
     * @return string value with information about stringToValidate
     */
    @GetMapping("/validate")
    public String validate(@RequestParam(value = "stringToValidate") String stringToValidate) {
        return validateString(stringToValidate);
    }
}
