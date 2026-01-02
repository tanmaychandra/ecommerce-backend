package com.ecommerce.controller;

import com.ecommerce.entity.Cart;
import com.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    // ➕ Add to cart
    @PostMapping("/add")
    public ResponseEntity<Cart> addToCart(
            Authentication auth,
            @RequestParam Long productId,
            @RequestParam int quantity
    ) {
        return ResponseEntity.ok(
                cartService.addToCart(auth.getName(), productId, quantity)
        );
    }

    // 👀 View cart
    @GetMapping
    public ResponseEntity<Cart> viewCart(Authentication auth) {
        return ResponseEntity.ok(cartService.viewCart(auth.getName()));
    }

    // ❌ Remove item
    @DeleteMapping("/item/{id}")
    public ResponseEntity<String> removeItem(@PathVariable Long id) {
        cartService.removeItem(id);
        return ResponseEntity.ok("Item removed");
    }
}
