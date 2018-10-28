package mvn.dao;

import java.util.List;

import mvn.model.CartInfo;
import mvn.model.OrderDetailInfo;
import mvn.model.OrderInfo;
import mvn.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
