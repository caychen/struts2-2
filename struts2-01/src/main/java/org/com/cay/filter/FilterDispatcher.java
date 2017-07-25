package org.com.cay.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.com.cay.entity.Product;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
@WebFilter("*.action")
public class FilterDispatcher implements Filter {

    /**
     * Default constructor. 
     */
    public FilterDispatcher() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//1、获取servletPath
		HttpServletRequest req = (HttpServletRequest)request;
		
		String servletPath = req.getServletPath();
		String path = "";
		
		//2、判断servletPath,若其等"/product-input.action"，则转发到/pages/input.jsp
		if("/product-input.action".equals(servletPath)){
			path = "/WEB-INF/pages/input.jsp";
		}
		
		//3、若等于"/product-save.action"
		//1)、获取请求参数
		//2)、把请求信息封装Product对象
		//3)、执行保存操作
		//4)、把Product对象保存到request中，
		else if("/product-save.action".equals(servletPath)){
			String productName = req.getParameter("productName");
			String productDetail = req.getParameter("productDetail");
			double productPrice = Double.parseDouble(req.getParameter("productPrice"));
			
			Product product = new Product();
			product.setProductName(productName);
			product.setProductDetail(productDetail);
			product.setProductPrice(productPrice);
			
			//模拟数据库保存
			System.out.println("Save product: " + product);
			
			//模拟数据库返回id
			product.setId(1001);
			
			request.setAttribute("product", product);
			
			path = "/WEB-INF/pages/detail.jsp";
			
		}
		
		
		if(path != null){
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
			
		

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
