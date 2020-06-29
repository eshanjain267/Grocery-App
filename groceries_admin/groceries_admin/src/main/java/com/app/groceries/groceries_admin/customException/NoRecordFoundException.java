package com.app.groceries.groceries_admin.customException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Product Not Found")
public class NoRecordFoundException extends Exception {
  
}
