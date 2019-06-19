package com.pack.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.multipart.MultipartFile;

import com.pack.form.Item;
//import com.pack.form.example;

public class ImageDaoImpl implements ImageDao {
	private JdbcTemplate jdbcTemplate;

	public ImageDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertRecords(String itemname, String category, Integer yearsofusage, MultipartFile image)
			throws IOException {
		// TODO Auto-generated method stub
		byte[] imagebytes = image.getBytes();
		String sql = "INSERT INTO EXAMPLE(ITEMNAME,CATEGORY,YEARSOFUSAGE,IMAGE) VALUES (?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] { itemname, category, yearsofusage, imagebytes });
	}

	/*
	 * @Override public List<example> itemList() { // TODO Auto-generated method
	 * stub List<example> list = jdbcTemplate.query("SELECT * FROM example", new
	 * RowMapper<example>() {
	 * 
	 * @Override public example mapRow(ResultSet rs, int rowNum) throws SQLException
	 * { example ex = new example(); ex.setItemname(rs.getString("itemname"));
	 * ex.setCategoryname(rs.getString("category"));
	 * ex.setYearsofusage(rs.getInt("yearsofusage")); return ex; } });
	 * 
	 * return list; }
	 */

	@Override
	public Blob getPhotoByName(String itemname) {
		// TODO Auto-generated method stub
		String query = "select image from example where itemname=?";
		Blob photo = jdbcTemplate.queryForObject(query, new Object[] { itemname }, Blob.class);
		return photo;
	}

	@Override
	public int fetchCategoryid(String categoryname) {
		// TODO Auto-generated method stub
		String query = "select categoryid from category where categoryname=?";
		int categoryid = jdbcTemplate.queryForInt(query, new Object[] { categoryname });
		return categoryid;
	}

	@Override
	public void insertItem(String itemname, int categoryid, Float price, Integer yearsofusage, int itemid,
			MultipartFile image, int userid,String description,int quantity) throws IOException {
		// TODO Auto-generated method stub
		byte[] imagebytes = image.getBytes();
		String sql = "INSERT INTO ITEM(ITEMNAME,CATEGORYID,PRICE,YEARSOFUSAGE,ITEMID,ITEMIMAGE,USERID,DESCRIPTION,QUANTITY) VALUES (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { itemname, categoryid, price, yearsofusage, itemid, imagebytes, userid ,description,quantity});
	}

	@Override
	public List<Item> fetchItemList() {
		// TODO Auto-generated method stub
		List<Item> list = jdbcTemplate.query("SELECT * FROM item", new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item i = new Item();
				i.setItemname(rs.getString("itemname"));
				i.setCategoryid(rs.getInt("categoryid"));
				i.setPrice(rs.getFloat("price"));
				i.setYearsofusage(rs.getInt("yearsofusage"));
				i.setItemid(rs.getInt("itemid"));
				i.setUserId(rs.getInt("userid"));
				i.setDescription(rs.getString("description"));
				i.setQuantity(rs.getInt("quantity"));
				return i;
			}
		});
		return list;
	}

	@Override
	public Blob getImageById(Integer itemid) {
		// TODO Auto-generated method stub
		String query = "select itemimage from item where itemid=?";
		Blob photo = jdbcTemplate.queryForObject(query, new Object[] { itemid }, Blob.class);
		return photo;
	}

	@Override
	public List<String> gatherCategory() {
		// TODO Auto-generated method stub
		List<String> list = jdbcTemplate.query("SELECT categoryname FROM category", new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("categoryname");
			}
		});
		return list;
	}

	@Override
	public Item getItemDetails(Integer itemid) {
		// TODO Auto-generated method stub
		List<Item> list = jdbcTemplate.query("select * from item where itemid="+itemid, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item i = new Item();
				i.setItemname(rs.getString("itemname"));
				i.setCategoryid(rs.getInt("categoryid"));
				i.setPrice(rs.getFloat("price"));
				i.setYearsofusage(rs.getInt("yearsofusage"));
				i.setItemid(rs.getInt("itemid"));
				i.setUserId(rs.getInt("userid"));
				i.setDescription(rs.getString("description"));
				i.setQuantity(rs.getInt("quantity"));
				System.out.println(i.getItemname());
				System.out.println(i.getItemid());
				return i;
			}
		});
		return list.get(0);
	}

	@Override
	public List<Item> getmyads(int userid) {
		// TODO Auto-generated method stub
		List<Item> list = jdbcTemplate.query("SELECT * FROM item where userid="+userid, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item i = new Item();
				i.setItemname(rs.getString("itemname"));
				i.setCategoryid(rs.getInt("categoryid"));
				i.setPrice(rs.getFloat("price"));
				i.setYearsofusage(rs.getInt("yearsofusage"));
				i.setItemid(rs.getInt("itemid"));
				i.setUserId(rs.getInt("userid"));
				i.setDescription(rs.getString("description"));
				i.setQuantity(rs.getInt("quantity"));
				return i;
			}
		});
		return list;
		
	}

	@Override
	public int removeItemDetails(Integer itemid) {
		// TODO Auto-generated method stub
		String sql="delete from cart where itemid=?";
		jdbcTemplate.update(sql,new Object[] {itemid});
		String sql1 = "delete from item where itemid=?";
		int item=jdbcTemplate.update(sql1,
				new Object[] { itemid});
		return item;
	}

	@Override
	public void addToCart(int attribute, Integer itemid) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CART(USERID,ITEMID) VALUES (?,?)";
		jdbcTemplate.update(sql,
				new Object[] { attribute,itemid});
	}

	@Override
	public List cartitemlist(int attribute) {
		// TODO Auto-generated method stub
		List<Integer> list = jdbcTemplate.query("SELECT itemid FROM cart where userid="+attribute, new RowMapper<Integer>() {

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("itemid");
			}
		});
		return list;
	}

	@Override
	public void removeFromCart(int attribute, Integer itemid) {
		// TODO Auto-generated method stub
		String sql = "delete from cart where userid=? and itemid=?";
		int item=jdbcTemplate.update(sql,
				new Object[] { attribute,itemid});
	}

	@Override
	public void setNewQauntity(Integer itemid, int i) {
		// TODO Auto-generated method stub
		String sql="update item set quantity=? where itemid=?";
		jdbcTemplate.update(sql,new Object[] {i,itemid});
	}

	@Override
	public List<Item> getParticularItems(String search) {
		// TODO Auto-generated method stub
		String query = "select categoryid from category where categoryname=?";
		int categoryid = jdbcTemplate.queryForObject(query, new Object[] { search }, Integer.class);
		List<Item> list = jdbcTemplate.query("SELECT * FROM item where categoryid="+categoryid, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item i = new Item();
				i.setItemname(rs.getString("itemname"));
				i.setCategoryid(rs.getInt("categoryid"));
				i.setPrice(rs.getFloat("price"));
				i.setYearsofusage(rs.getInt("yearsofusage"));
				i.setItemid(rs.getInt("itemid"));
				i.setUserId(rs.getInt("userid"));
				i.setDescription(rs.getString("description"));
				i.setQuantity(rs.getInt("quantity"));
				return i;
			}
		});
		return list;
	}

	@Override
	public String fetchCategoryName(int itemid) {
		// TODO Auto-generated method stub
		String query = "select categoryname from category where categoryid=?";
		String categoryname = jdbcTemplate.queryForObject(query,new Object[] { itemid },String.class);
		return categoryname;
	}

	@Override
	public void editItem(String itemname, int categoryid, Float price, Integer yearsofusage, Integer itemid,
			MultipartFile image, String description, int quantity) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update item set itemname=? where itemid=?",new Object[] {itemname,itemid});
		jdbcTemplate.update("update item set categoryid=? where itemid=?",new Object[] {categoryid,itemid});
		jdbcTemplate.update("update item set price=? where itemid=?",new Object[] {price,itemid});
		jdbcTemplate.update("update item set yearsofusage=? where itemid=?",new Object[] {yearsofusage,itemid});
		jdbcTemplate.update("update item set description=? where itemid=?",new Object[] {description,itemid});
		jdbcTemplate.update("update item set quantity=? where itemid=?",new Object[] {quantity,itemid});
	}

	@Override
	public void editItem1(String itemname, int categoryid, Float price, Integer yearsofusage, Integer itemid,
			MultipartFile image, String description, int quantity) throws IOException {
		// TODO Auto-generated method stub
		byte[] imagebytes = image.getBytes();
		jdbcTemplate.update("update item set itemname=? where itemid=?",new Object[] {itemname,itemid});
		jdbcTemplate.update("update item set categoryid=? where itemid=?",new Object[] {categoryid,itemid});
		jdbcTemplate.update("update item set price=? where itemid=?",new Object[] {price,itemid});
		jdbcTemplate.update("update item set yearsofusage=? where itemid=?",new Object[] {yearsofusage,itemid});
		jdbcTemplate.update("update item set description=? where itemid=?",new Object[] {description,itemid});
		jdbcTemplate.update("update item set quantity=? where itemid=?",new Object[] {quantity,itemid});
		jdbcTemplate.update("update item set itemimage=? where itemid=?",new Object[] {imagebytes,itemid});
	}

}
