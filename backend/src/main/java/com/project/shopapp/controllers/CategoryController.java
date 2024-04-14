package com.project.shopapp.controllers;
import com.project.shopapp.dtos.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    /*
    Show all categories
    */
    @GetMapping("") //?page=1&limit=10
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ){
        return ResponseEntity.ok(String.format("Hello world::page="+page+"::limit="+limit));
    }
    /*
    Create new categories
    @RequestBody mean data in request.body
    */
    @PostMapping("")
    public ResponseEntity<String> createCategories(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok("Hello world Post");
    }
    /*
    Update categories of id
    */
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategories(@PathVariable Long id){
        return ResponseEntity.ok("Put with ID::"+id);
    }
    /*
    Delete categories of id
    */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategories(@PathVariable Long id){
        return ResponseEntity.ok("Delete with ID::"+id);
    }

}
