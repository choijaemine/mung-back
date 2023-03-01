package com.example.mungmung.member.controller

import com.example.mungmung.member.SignUpRequest
import com.example.mungmung.member.service.MemberService

import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@Slf4j
@RestController
@RequestMapping("/member")
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class UserController {

    @Autowired
    val service: MemberService? = null

    @GetMapping("/naver-login")
    open fun authNaver(@RequestParam code: String?, @RequestParam state: String?): String? {
        println("authNaver()")

        return service!!.authenticationNaver(code, state)
    }

    @PostMapping("/sign-up")
    fun signUp(@RequestBody request: SignUpRequest): Boolean {
       println("signUp: $request")
        return service!!.signUp(request)
    }








}