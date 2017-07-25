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
		//1����ȡservletPath
		HttpServletRequest req = (HttpServletRequest)request;
		
		String servletPath = req.getServletPath();
		String path = "";
		
		//2���ж�servletPath,�����"/product-input.action"����ת����/pages/input.jsp
		if("/product-input.action".equals(servletPath)){
			path = "/WEB-INF/pages/input.jsp";
		}
		
		//3��������"/product-save.action"
		//1)����ȡ�������
		//2)����������Ϣ��װProduct����
		//3)��ִ�б������
		//4)����Product���󱣴浽request�У�
		else if("/product-save.action".equals(servletPath)){
			String productName = req.getParameter("productName");
			String productDetail = req.getParameter("productDetail");
			double productPrice = Double.parseDouble(req.getParameter("productPrice"));
			
			Product product = new Product();
			product.setProductName(productName);
			product.setProductDetail(productDetail);
			product.setProductPrice(productPrice);
			
			//ģ�����ݿⱣ��
			System.out.println("Save product: " + product);
			
			//ģ�����ݿⷵ��id
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
