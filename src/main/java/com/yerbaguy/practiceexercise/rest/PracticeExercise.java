package com.yerbaguy.practiceexercise.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Path("/json/metallica")
public class PracticeExercise {
	
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Word getWord() {

		Word word = new Word();
		word.setEngWord("Enter Sandman");
		
		return word;

	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
//	public Response createTrackInJSON(@QueryParam("engword") String engword) {
	public Response createTrackInJSON(@QueryParam("engword") String engword) throws JSONException {	
		
	    Word word = new Word();
		//word.setEngWord(engword);
		
		//String eng = engword.getString("engword");
		
		//String engword = word.setEngWord(engword);
		
	 // System.out.println("engword:" + word.getEngWord());
	  
	  System.out.println("engword:" + engword);
		
		

		String result = "Track saved : " + engword;
		//return Response.status(201).entity(result).build();
	//	return Response.notModified(engword).build();
	//	return Response.ok(word.getEngWord()).build(); //here
		
		return Response.status(201).entity(result).build();

	}
	

}
