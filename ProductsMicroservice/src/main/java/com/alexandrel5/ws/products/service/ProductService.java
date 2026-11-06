package com.alexandrel5.ws.products.service;

import com.alexandrel5.ws.products.rest.CreateProductRestModel;

public interface ProductService {

    String createProduct(CreateProductRestModel productRestModel) throws Exception;
}
