package jp.co.internous.ecsite.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 注文履歴情報にアクセスするためのDAO
 */
@Mapper
public interface OrderHistoryDao {

	// 注文情報を登録する
	@Insert("""
			INSERT
				order_history
				(product_id,order_count,ordered_at)
			VALUE
				(#{productId},#{orderCount},NOW());
            """)
	public void insertOrderHistory(int productId, int orderCount);

}
