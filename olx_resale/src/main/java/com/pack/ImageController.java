package com.pack;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pack.form.Item;
import com.pack.form.User;
//import com.pack.form.example;
import com.pack.service.ImageService;

@Controller
public class ImageController {
	private static Logger log=Logger.getLogger(ImageController.class);
	@Autowired(required = true)
	@Qualifier(value = "imageService")
	ImageService imageService;
	//List<Item> list = new ArrayList();

	@RequestMapping(value = "/insertimage", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam(required = false, value = "itemname") String itemname,
			@RequestParam(required = false, value = "categoryname") String categoryname,
			@RequestParam(required = false, value = "yearsofusage") Integer yearsofusage,
			@RequestParam(required = false, value = "image") MultipartFile image) {

		try {
			imageService.insertRecords(itemname, categoryname, yearsofusage, image);
			System.out.println("inside image controller");
			return new ModelAndView("example", "msg", "Records succesfully inserted into database.");

		} catch (Exception e) {
			return new ModelAndView("example", "msg", "Error: " + e.getMessage());
		}
	}

	/*
	 * @RequestMapping(value = "/fetch") public ModelAndView
	 * listStudent(ModelAndView model) throws IOException {
	 * 
	 * List<example> imagelist = imageService.itemList();
	 * 
	 * model.addObject("imagelist", imagelist); model.setViewName("index");
	 * 
	 * return model; }
	 */

	@RequestMapping(value = "/getStudentPhoto/{itemname}")
	public void getStudentPhoto(HttpServletResponse response, @PathVariable("itemname") String itemname)
			throws Exception {
		response.setContentType("image/jpeg");

		Blob ph = imageService.getPhotoByName(itemname);

		byte[] bytes = ph.getBytes(1, (int) ph.length());
		InputStream inputStream = new ByteArrayInputStream(bytes);
		IOUtils.copy(inputStream, response.getOutputStream());
	}

	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	public ModelAndView postItem(@RequestParam(required = false, value = "itemname") String itemname,
			@RequestParam(required = false, value = "categoryname") String categoryname,
			@RequestParam(required = false, value = "price") Float price,
			@RequestParam(required = false, value = "yearsofusage") Integer yearsofusage,
			@RequestParam(required = false, value = "image") MultipartFile image,
			@RequestParam(required = false, value = "description") String description,
			@RequestParam(required = false, value = "quantity") int quantity,HttpSession session) {
		try {
			log.info("inside add item method");
			System.out.println("Inside post item method");
			int userid = (int) session.getAttribute("userid");
			System.out.println(userid);
			int categoryid = imageService.fetchCategoryid(categoryname);
			System.out.println("The fetched category id is" + categoryid);
			Random r = new Random();
			int itemid = r.nextInt(999) + 100;
			imageService.insertItem(itemname, categoryid, price, yearsofusage, itemid, image, userid, description,quantity);
			System.out.println("inside image controller");
			List<Item> itemslist = imageService.fetchItemList();
			session.setAttribute("itemslist", itemslist);
			System.out.println("after fetch item list");
			return new ModelAndView("afterlogin", "msg", "Records succesfully inserted into database.");

		} catch (Exception e) {
			return new ModelAndView("sell", "msg", "Error: " + e.getMessage());
		}
	}

	@RequestMapping(value = "/getItemImage/{itemid}")
	public void getStudentPhoto(HttpServletResponse response, @PathVariable("itemid") Integer itemid) throws Exception {
		response.setContentType("image/jpeg");
		log.info("inside get student photo method");
		Blob ph = imageService.getImageById(itemid);

		byte[] bytes = ph.getBytes(1, (int) ph.length());
		InputStream inputStream = new ByteArrayInputStream(bytes);
		IOUtils.copy(inputStream, response.getOutputStream());
	}

	@RequestMapping(value = "/collectitem")
	public String collectitem(HttpServletRequest request) {
		List<Item> itemslist = imageService.fetchItemList();
		log.info("inside collect item method");
		request.setAttribute("items", itemslist);
		return "homepage";
	}

	@RequestMapping(value = "/inter")
	public String collectitemforafterlogin(HttpSession session) {
		log.info("inside collect item after login");
		List<Item> itemslist = imageService.fetchItemList();
		session.setAttribute("itemslist", itemslist);
		return "afterlogin";
	}

	@RequestMapping(value = "/sell")
	public String postAd(HttpSession session) {
		log.info("inside sell method");
		List<String> list = imageService.gatherCategory();
		session.setAttribute("categoryname", list);
		return "sell";
	}

	@RequestMapping(value = "/itempage/{itemid}")
	public String getSingleItem(HttpSession session, @PathVariable("itemid") Integer itemid) {
		log.info("inside get single item method");
		Item item = imageService.getItemDetails(itemid);
		session.setAttribute("singleitem", item);
		return "index2";
	}

	@RequestMapping(value = "/cart/{itemid}")
	public String addToCart(HttpSession session, @PathVariable("itemid") Integer itemid) {
		Item item = imageService.getItemDetails(itemid);
		
		//list.add(item);
		imageService.addToCart((int)session.getAttribute("userid"),itemid);
		log.info("inside add to cart method");
		//session.setAttribute("cartitemlist", list);
		return "intermediate";
	}

	@RequestMapping(value = "/cartpage")
	public String cartPage(HttpSession session) {
		log.info("inside cart page method");
		List <Integer>list=imageService.cartitemlist((int)session.getAttribute("userid"));
		List <Item> listOfItem=new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			Item item=imageService.getItemDetails(list.get(i));
			listOfItem.add(item);
		}
		session.setAttribute("cartitemlist", listOfItem);
		return "cart";
	}

	@RequestMapping(value = "/removefromcart/{itemid}")
	public String removeFromCart(HttpSession session, @PathVariable("itemid") Integer itemid) {
		log.info("remove from cart method");
		imageService.removeFromCart((int)session.getAttribute("userid"),itemid);
		return "index3";
	}
	
	@RequestMapping(value = "/myadspage")
	public String myAdsPage(HttpSession session) {
		log.info("inside my ads page");
		int userid=(int)session.getAttribute("userid");
		List<Item>myadslist=imageService.getmyads(userid);
		session.setAttribute("myads", myadslist);
		return "myads";
	}

	
	@RequestMapping(value = "/removemyads/{itemid}")
	public String removeMyAds(HttpSession session,@PathVariable("itemid") Integer itemid) {
		log.info("inside remove my ads method");
		int item = imageService.removeItemDetails(itemid);
		return "index5";
	}
	
	@RequestMapping(value="/buy/{itemid}",method=RequestMethod.POST)
	public String buyNow(HttpServletRequest request, @PathVariable("itemid") Integer itemid)
	{
		System.out.println("inside buy method");
		log.info("inside buy now method");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		Item item=imageService.getItemDetails(itemid);
		if(quantity<=item.getQuantity())
		{
			if(quantity-item.getQuantity()==0)
			{
				imageService.removeItemDetails(itemid);
				System.out.println("Item removed");
			}
			else
			{
				imageService.setNewQuantity(itemid,item.getQuantity()-quantity);
				System.out.println("Item quantity updated");
			}
		}
		else
		{
			return "index7";
		}
		return "payment";
	}
	
	@RequestMapping(value="/search",method = RequestMethod.POST)
	public String searchCategory(HttpServletRequest request,HttpSession session)
	{
		log.info("inside search category method");
		String search=request.getParameter("search");
		List<Item>itemslist=imageService.getParticularItems(search);
		session.setAttribute("itemslist", itemslist);
		return "afterlogin";
	}
	
	@RequestMapping(value="/searchAtHomepage",method = RequestMethod.POST)
	public String searchCategoryAtHomepage(HttpServletRequest request)
	{
		log.info("inside search category method");
		String search=request.getParameter("search");
		List<Item>itemslist=imageService.getParticularItems(search);
		request.setAttribute("items", itemslist);
		return "homepage";
	}

	@RequestMapping(value="/logout")
	public String logoutFun(HttpSession session,HttpServletRequest request)
	{
		log.info("inside logout fun method");
		session.invalidate();
		request.removeAttribute("msg");
		return "index6";
	}
	
	@RequestMapping(value="/proceedtopay",method=RequestMethod.POST)
	public String proceedToPay(HttpSession session)
	{
		log.info("inside proceed to pay method");
		return "intermediate";
	}
	
	@RequestMapping(value="/load")
	public String load()
	{
		log.info("inside load error method");
		return "error";
	}
	
	@RequestMapping(value = "/editmyad/{itemid}")
	public String editMyAd(HttpSession session,@PathVariable("itemid") Integer itemid) {
		log.info("inside edit my ad method");
		Item item = imageService.getItemDetails(itemid);
		String categoryname=imageService.fetchCategoryName(item.getCategoryid());
		session.setAttribute("categoryname", categoryname);
		session.setAttribute("edititem", item);
		return "editad";
	}
	
	@RequestMapping(value = "/edititem/{itemid}",method = RequestMethod.POST)
	public String editItem(HttpSession session,@PathVariable("itemid")Integer itemid,@RequestParam(required = false, value = "itemname") String itemname,
			@RequestParam(required = false, value = "categoryname") String categoryname,
			@RequestParam(required = false, value = "price") Float price,
			@RequestParam(required = false, value = "yearsofusage") Integer yearsofusage,
			@RequestParam(required = false, value = "image") MultipartFile image,
			@RequestParam(required = false, value = "description") String description,
			@RequestParam(required = false, value = "quantity") int quantity) throws IOException
	{
		log.info("inside edit item method");
		int categoryid = imageService.fetchCategoryid(categoryname);
		if(image.isEmpty())
		{
			//System.out.println("Photo not updated....");
			imageService.editItem(itemname, categoryid, price, yearsofusage, itemid, image, description,quantity);
		}
		else
		{
			//System.out.println("Photo updated....");
			imageService.editItem1(itemname, categoryid, price, yearsofusage, itemid, image, description,quantity);
		}
		return "index8";
	}
}
