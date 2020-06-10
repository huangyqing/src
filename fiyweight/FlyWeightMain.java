package ÏíÔªÄ£Ê½;


public class FlyWeightMain {
	public static void main(String[] args) {
		WebSiteFactory wf = new WebSiteFactory();
		WebSite webSite1 = wf.getWebSiteCategory("show product");
		webSite1.use(new User("Lincoln"));
		WebSite webSite2 = wf.getWebSiteCategory("Blog");
		webSite2.use(new User("Lincoln"));
		WebSite webSite3 = wf.getWebSiteCategory("Blog");
		webSite3.use(new User("Jim6"));
		WebSite webSite4 = wf.getWebSiteCategory("Blog");
		webSite4.use(new User("Kenny"));
		System.out.println("total website: " + wf.getWebSiteCount());
	}
}
