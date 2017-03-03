package facade;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class MediumFacade {

    private CuiYuanApartment cuiyuan;
    private XiXiApartment xixi;
    private XiHuApartment xihu;

    public MediumFacade() {
        cuiyuan = new CuiYuanApartment("翠园小区",900,1);
        xixi = new XiXiApartment("西溪小区",1200,1);
        xihu = new XiHuApartment("西湖小区", 2600,1);
    }
    public void rentingHouse(double price){
        if(price >= cuiyuan.getPrice()&& cuiyuan.getStatus()!= 0){
            System.out.println("预定" + cuiyuan.getLocation());
            cuiyuan.setStatus(0);
        }else if ( price>=xixi.getPrice() && xixi.getStatus()!= 0){
            System.out.println("预定"+ xixi.getLocation());
            xixi.setStatus(0);
        }else if ( price>= xihu.getPrice() && xihu.getStatus()!=0){
            System.out.println("预定" + xihu.getLocation());
            xihu.setStatus(0);
        }else{
            System.out.println("出价太低/没有房源...");
        }
    }
}
