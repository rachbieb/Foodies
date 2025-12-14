package com.karthik.foodiesapi.service;

import com.karthik.foodiesapi.io.CartRequest;
import com.karthik.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
