//package springmvc.controller;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import springmvc.model.User;
//
//public class ContactValidator implements Validator {
//
//   @Override
//   public boolean supports(Class<?> clazz) {
//      return User.class.isAssignableFrom(clazz);
//   }
//
//   @Override
//   public void validate(Object target, Errors errors) {		
//      ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
//         "email", "required.email","email is required.");
//   }
//}
