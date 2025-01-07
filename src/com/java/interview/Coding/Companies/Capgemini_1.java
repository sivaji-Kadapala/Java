package com.java.interview.Coding.Companies;

import java.util.stream.Collectors;
import java.util.Arrays;
public class Capgemini_1
{
	public static void main(String[] args) {
// 	    input: abc1def2gh3ij4lkm5
// out: gh,ij
 
	String input="abc1def2gh3ij4lkm5";

System.out.print(Arrays.stream(input.split("\\d"))
.filter(s->s.matches("[a-z]+"))
.skip(2)
.limit(2)
.collect(Collectors.toList())
);
	}}