### 首页

* 首页头部全局搜索

  **参数说明（post请求）**

  发送：         菜品名称字符串

  返回：

  ​					image_src                菜品图片

  ​					goods_id                  菜品唯一标识

  ​					goods_name           菜品名称

  ​					price                         菜品价格

  ​					shops_id                  菜品所属食堂id

  ​					score                        菜品评分

  ​				   shops_name            菜品所属食堂名称           

  ​					meta                        判断是否存在信息

  ```
  {
      "message": [
          {
              "image_src": "url", 
              "goods_id": 129, 
              "goods_name": "干锅",
              "price":10,
              " shops_name":"民族食堂",
              "shops_id":"12",
              "score":20
          }, 
          {
              "image_src": "url", 
              "goods_id": 395, 
              "good_name": "干锅",
              "price":10,
              " shops_name":"民族食堂",
              "shops_id":"12",
              "score":20
          }, 
          {
              "image_src": "url", 
              "goods_id": 38, 
              "good_name": "干锅",
              "price":10,
              " shops_name":"民族食堂",
              "shops_id":"12",
              "score":20
          }
      ], 
      "meta": {
          "msg": "true", 
          "status": 200
      }
  }
  
  ```

* 首页推荐数据（随机产生若干）

  **参数说明(get请求)** 

  image_src                          菜品图片

  goods_id                            菜品唯一标识

  goods_name                     菜品名称

  price                                   菜品价格

  shops_id                            菜品所属食堂id

  meta                                  状态信息

  meta -> msg                     判断是否得到数据   (true 或 false)

  meta -> status                  状态码    200获取成功    400获取失败    404后台发生错误  502服务器暂时不可用 

  ```json
  {
      "message": [
          {
              "image_src": "url", 
              "goods_id": 129, 
              "goods.name": "干锅",
              "price":10,
              "shops_id":"12"
          }, 
          {
              "image_src": "url", 
              "goods_id": 395, 
              "goods.name": "干锅",
              "price":10,
              "shops_id":"12"
          }, 
          {
              "image_src": "url", 
              "goods_id": 38, 
              "goods.name": "干锅",
              "price":10,
              "shops_id":"12"
          },
           {
              "image_src": "url",
              "goods_id": 38, 
              "goods.name": "干锅",
               "price":10,
               "shops_id":"12"
          },
           {
              "image_src": "url",  
              "goods_id": 38, 
              "goods.name": "干锅",
               "price":10,
               "shops_id":"12"
          },
      ], 
      "meta": {
          "msg": true, 
          "status": 200
      }
  }
  ```

* 首页食堂数据

  **参数说明(get请求)**

  image_src                  食堂图片

  shops_id                    食堂唯一标识

  shops_name              食堂名称

  introduce                  食堂简单介绍
  
  shops_exist               判断食堂是否打烊
```json
{
    "message": [
        {
            "image_src": "url", 
            "shops_id": 129, 
            "shops.name": "民族食堂",
            "introduce":"适合大多数人的食堂",
             "shops_exist ": true
        }, 
         {
            "image_src": "url", 
            "shops_id": 129, 
            "shops.name": "食堂一楼",
            "introduce":"冒菜，小面",
             "shops_exist ": true
        }, 
         {
            "image_src": "url", 
            "shops_id": 129, 
            "shops.name": "食堂三楼",
            "introduce":"环境优美舒适",
            "shops_exist ": true
        }
    ],
    
    "meta": {
        "msg": true, 
        "status": 200
    }
}

```

### 进入具体的食堂
* 食堂头部搜索

  **参数说明（post请求）**

  发送:                 菜品名称字符串

  返回：               

  ​						image_src		  菜品图片

  ​						goods_id			菜品唯一标识

  ​						goods_name 	菜品名称

  ​						price                    菜品价格

  ​						exist                     菜品是否买完标识

  ​					   shops_id              菜品所属食堂的id

  ​					   score                   评分     
  
  ```
  { 
      "message": [
          {
              "image_src": "url", 
              "goods_id": 129, 
              "goods_name": "干锅",
              "price":10,
              "shops_id":"12",
              "score":20,
              "exist":false
          }, 
          {
              "image_src": "url", 
              "goods_id": 395, 
              "good.name": "干锅",
              "price":10,
              "shops_id":"12",
              "score":20，
               "exist":false
          }, 
          {
              "image_src": "url", 
              "goods_id": 38, 
              "good.name": "干锅",
              "price":10,
              "shops_id":"12",
              "score":20，
              "exist":false
          }
      ], 
      "meta": {
         "msg": true, 
          "status": 200
      }
  }
  
  ```

* 食堂菜单数据

  **参数说明（post请求  ）**

   发送:                  食堂shops_id

   返回：

  ​				          shops_name             食堂名称      

  ​						  class_name               大的分类名称

  ​						  children                     分类下的菜品数组

  ​						  goods_id                    菜品唯一标识

  ​						  goods_name             菜品名称

  ​                          image_src                  菜品图片

  ​                          exist                           菜品是否买完标识

  ​						  price                          菜品价格

  ​						 shops_id                     菜品所属食堂的id

  ​						 score                           菜品评分

  ```json
  
  {
      "shops_name":"民族食堂",
      "message": [
          {
              "class_name": "主食", 
              "children": [
                  {
                      "goods_id": 23, 
                      "goods_name": "馒头", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                
                  }, 
                   {
                      "goods_id": 23, 
                      "goods_name": "馒头", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                
                  }, 
                   {
                      "goods_id": 23, 
                      "goods_name": "馒头", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                
                  },
              ]
          },
          {
              "class_name": "汤类", 
              "children": [
                  {
                      "goods_id": 23, 
                      "goods_name": "鱼汤", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                  }, 
                  {
                      "goods_id": 23, 
                      "goods_name": "羊汤", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                  }
              ]
          },
          {
              "class_name": "菜品", 
              "children": [
                  {
                      "goods_id": 23, 
                      "goods_name": "红烧牛肉", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                  },
                  {
                      "goods_id": 23, 
                      "goods_name": "红烧牛肉", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                  },
                  {
                      "goods_id": 23, 
                      "goods_name": "红烧牛肉", 
                      "image_src": "url",
                      "exist":true,
                      "price":20,
                      "shops_id":"12",
                      "score":23
                  }
              ]
          }
          
      ], 
      "meta": {
          "msg": true, 
          "status": 200
      }
  }
  ```
  ### 支付（post请求）
  
  发送数据：
  
   食堂标识  （shops_id）
  
   商品标识     (goods_id)

​	    总金额         (all_price)

​		地址             (address)

​		优惠卷           (id)         

​		备注信息         (message)

​		数量              (number)

​		桌号              （table）


### 订单

  **参数说明（post请求）**

  发送：     用户token

  返回：

  ​				sucess                   **已经完成**的订单数组

  ​				goods_id                菜品唯一标识

  ​				goods_name         菜品名称

  ​				image_src             菜品图片

  ​				number                  菜品数量

  ​                time                        交易时间

  ​				should_price          应付金额

  ​				real_price 			 实付金额

  ​				all_price                 总价格

  ​				being                    **正在进行**的订单数组

  ​				shops_name        食堂名称

  ​				tables                   桌号

  ​          	 order_id              订单序列号



  ```
  {
      "success": [
          {
             "goods_id":19,
             "goods_name":"干锅"，
             "image_src":url,
             "number":2，
             "time":"2022-7-11",
             "all_price":20,
             "should_price":20,
             "real_price":16,
             "order_id ":1224325346354634634
          }, 
          {
             "goods_id":19,
             "goods_name":"干锅"，
             "image_src":url,
             "number":2，
             "time":"2022-7-11",
             "all_price":20,
             "should_price":20,
             "real_price":16,
              " order_id ":1224325346354634634
          }, 
        {
             "goods_id":19,
             "goods_name":"干锅"，
             "image_src":url,
             "number":2，
             "time":"2022-7-11",
             "all_price":20,
             "should_price":20,
             "real_price":16,
             " order_id ":1224325346354634634
          }, 
      ], 
      "being": [
          {
             "goods_id":19,
             "src":url,
             "goods_name":"干锅"，
             "number":3，
             "shops_name":"民族食堂"
             "table":20,
             "all_price":20,
             "should_price":20,
             "real_price":16,
          }   
      ], 
      "meta": {
          "msg": true, 
          "status": 200
      }
  }
  ```
###        我的


* 程序日志

  **参数说明（get请求）**

  id                                             程序更新信息唯一标识id

  version                                   版本号

  speed_message                    更新信息

  time                                        发布时间

  ```
  {
      "message": [
          {
             "id":19,
             "version":"0.1.0",
             "speed_message":"第一部分......."，
             "time":"2022-7-11"
          }, 
          {
             "id":19,
             "version":"0.1.0",
             "speed_message":"第二部.......分"，
             "time":"2022-7-11"
          }, 
          {
              "id":19,
              "version":"0.1.0",
             "speed_message":"第三部分......."，
             "time":"2022-7-11"
          }
      ], 
      "meta": {
          "msg": true, 
          "status": 200
      }
  }
  ```

* 优惠卷

  **参数说明（get请求）**

  id                           优惠卷唯一标识

  money                   抵扣金额

  use_requrie	      使用条件

  begin_time            开始时间

  end_time               结束时间

  exist                      是否可以使用

  ```
  {
      "message": [
          {
             "id":19,
             "money":10,
             "use_requrie":满10元使用,
             "begin_time":"2022-7-11",
             "end_time":"2022-7-11",
             "exist":true
          },
          {
             "id":19,
             "money":10,
             "use_requrie":满10元使用,
             "begin_time":"2022-7-11",
             "end_time":"2022-7-11",
             "exist":true
          },
           {
             "id":19,
             "money":10,
             "use_requrie":满10元使用,
              "begin_time":"2022-7-11",
             "end_time":"2022-7-11",
             "exist":true
          }
      ], 
      "meta": {
          "msg": true, 
          "status": 200
      }
  }
  ```





