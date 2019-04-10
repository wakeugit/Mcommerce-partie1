package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE, reason="Impossible d'ajouter un produit dont le prix est 0")
public class ProduitGratuitException extends RuntimeException {
    public ProduitGratuitException(){}
}
