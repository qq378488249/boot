package com.blue.boot.domain;

/**
 * 错误枚举
 *
 * @author guoyu
 */
public enum ErrorEnum1 {

    SUCCESS(200, "成功"),
    SERVER_ERROR(500, "vka服务器发生错误"),
    SERVER_JSON_ERROR(501, "json格式错误"),
    SERVER_AUTH_IllegalParam(502, "参与计算校验的参数中不能出现 签名校验 字段_sign="),
    SERVER_AUTH_IllegalSign(503, "客户端的签名和服务器不一致，内容可能被篡改，或者计算规则错误，请联系'系统管理员'"),
    SERVER_AUTH_TIMEOUT(504, "接口有效访问时间过期"),
    SERVER_REQUEST_ERROR(505,"请求错误"),

    WX_NOT_BIND_STORE(1088, "商家没有开通微信公众平台或者微信支付功能"),
    ACCOUNT_EXISTS(1004, "帐号已存在"),
    ACCOUNT_LOCKED(1002, "账号锁定"),
    ACCOUNT_NOT_EXISTS(1005, "账号不存在"),
    ACCOUNT_PASS_ERROR(1001, "账号或密码不正确"),
    PASSWORD_EMPTY(1025, "密码为空"),
    PASSWORD_ERROR(1003, "密码错误"),
    BALANCE_NOT_ENOUGH(1007, "余额不足"),
    POINT_NOT_ENOUGH(1013, "积分不足"),
    EXCEL_ERROR(1009, "不是正确的Excel文件"),
    EXCEL_FORMAT(1011, "Excel格式错误"),
    MOBILE_EXISTS(1006, "手机号已存在"),
    NOT_PERMISSION(1008, "没有权限进行该操作"),
    OVER_COUNT(1010, "超出创建分店数量"),
    PARAM_ERROR(1012, "无效参数"),
    @Deprecated
    APPKEY_ERROR(1014, "appKey and appSecret is error!"),
    APPKEY_EXPIRED(1015, "appkey expired"),
    CODE_ERROR(1020, "code is error!"),
    CODE_EXPIRED(1021, "code expried!"),
    TOKEN_ERROR(1022, "token错误"),
    TOKEN_EXPIRED(1023, "token已过期,请重新登录"),
    COPONS_EXPIRED(1016, "优惠券已失效"),
    ACTIVITY_EXISTS_IN_DATE(1017, "该时间范围内已存在相同类型活动"),
    ACTIVITY_EXISTS_CLOSE_IN_DATE(1058, "这个时间段内已经存在关闭的相同类型活动"),
    CANCEL_ORDER_INVALID_DATE(1018, "该订单已经超过最后退单时间"),
    SMS_EXPIRED(1019, "短信已过期"),
    EXCEL_OVERFLOW(1024, "excel 数据太多, 一次导入不能超过5000个"),
    STORE_NOT_EXIST(1026, "店铺不存在"),
    ORDER_IS_CANCEL(1027, "订单已取消，请不要重复操作"),
    CATEGORIES_EXIST(1028, "一级种类下存在二级种类"),
    PRODUCT_EXIST(1029, "商品不存在"),
    NAME_EXIST(1030, "名字已存在"),
    USER_NOT_EXIST(1031, "用户不存在"),
    PRODUCT_ATTRIBUTE_EXIST(1033, "该分组下已经存在该商品属性"),
    CARD_BINDED(1032, "该会员卡已经被绑定"),
    STORE_NONSUPPORT_TAKEAWAY(1034, "店铺不支持外卖"),
    NOT_TAKEAWAY_NONSUPPORT_COD(1035, "非外卖店铺不支持货到付款"),
    /**
     * @see #CARD_NOTFOUND
     */
    @Deprecated
    CARD_NOT_EXIST(1036, "会员不存在"),
    CARD_AMOUNT_NOT_ENOUGH(1037, "会员卡余额不足"),
    ORDERS_NOT_EXIST(1038, "订单不存在"),

    STORE_NOT_FAMILY(1039, "不是同一家店铺"),
    STORE_CODE_NOT_EXISTS(1040, "门店编码不存在"),
    EMPLOYEE_NOT_IS_BRAND(1041, "该员工不是本店员工"),
    STORE_CODE_EXISTS(1042, "该门店编码已存在"),
    TICKET_NOT_ENOUGH(1043, "优惠券数量不足"),
    TICKET_IS_USE(1044, "优惠券已使用", "优惠券已使用"),//this.put("cn_message", "优惠券已使用");
    TICKET_EXPIRE(1045, "优惠券已过期", "优惠券已过期"),//this.put("cn_message", "优惠券已过期");
    TICKET_ERROR(1046, "优惠券错误，非法使用", "优惠券错误，非法使用"),//this.put("cn_message", "优惠券错误，非法使用");
    PRICE_DISCORD(1047, "金额数目不一致", "金额数目不一致"),//this.put("cn_message", "金额数目不一致");
    CARD_BALANCE_OVER(1048, "card balance is over!", "卡内金额已达上限"),
    ACTIVITIES_EXISTS_IN_DATE(1049, "activities exists in date", "时间范围内已存在同种类型的活动"),
    MEMBERTRANSFER_NOTFIND_OUTCARD(1050, "转出会员卡信息不存在"),//Response 有误
    MEMBERTRANSFER_NOTFIND_INCARD(1051, "转入会员卡信息不存在"),
    MEMBERTRANSFER_BALANCE_DEFICIENCY(1052, "转出会员卡余额不足"),
    DISTRICT_STORE_ASSOCIATED(1053, "本区域或下属区域有店铺关联,无法删除"),
    PAYMENTCODE_CODE_EXISTS(1054, "支付码不存在"),
    PAYMENTCODE_CODE_EXPIRE(1055, "支付码已过期"),
    PAYMENTCODE_CODE_EXISTSCARD(1056, "支付码和会员卡卡号不一致"),
    PAYMENTCODE_MORE_CONSUMPTION(1057, "本次消费会员卡与之前消费的会员卡不一致(不能同时消费多张卡)"),
    CANCEL_POINT_NOT_ENOUGH(1059, "消费退单时, 积分不够, 不能退单"),
    CANCEL_TRANS_GIVE_USED(1202, "取消订单时,赠送物品已使用"),
    NONSUPPORT_CANCEL(1060, "该交易类型暂时不支持退单"),
    LEVEL_EXPERIENCE_LIMIT_CONFLICT(1061, "会员等级的经验值上下限与其他会员等级冲突!"),
    LEVEL_HAVE_USER_ERROR(1062, "该等级下已存在会员，无法删除!"),
    SOME_TABLE_NUM(1063, "在同一家店铺中，无法添加相同的桌位号！"),
    SOME_TABLE_NUM_UPD(1065, "在同一家店铺中，已经存在相同的桌位号！"),
    NO_SON_STORE_ERR(1064, "操作失败, 因为该功能只能在分店中使用"),
    NO_SON_STORE_INFO(1066, "没有分店信息，请联系店主！"),
    NO_GET_TABLE_NUM(1067, "桌位号没有获取到！"),
    NO_OPENID(1087, "获取到openId出错"),
    STORE_CONFIG_NOT_EXIST(1089, "店铺没有配置这个功能"),
    FILE_UPLOAD_FAIL(1090, "文件上传失败！"),
    NO_ZONGDIAN_NO_DO(1091, "不是总店，无法操作！"),
    DISTRICT_EMPLOYEE_ASSOCIATED(1010, "本区域或下属区域已分配给员工,无法删除"),
    NO_INVENTORY(1110, "亲，您的手速慢了点，已经被别的朋友抢完了"),
    INVENTORY_PROBLEM(1111, "抱歉，库存不足！"),
    CANCEL_PUBLISHING(1200, "抱歉，该商品已下架！"),
    NORMAL_STOP(1201, "程序正常终止"),
    TOTAL_TIMES_AMOUNT(1202, "系统错误，请联系管理员！"),
    NO_VALID_STATUS(1210, "存在相同类型有效的配置，您可以关闭该类型的配置再添加, 或者在下面直接修改参数"),
    ON_FAIL_BY_RETURN_CODE_FAIL(1230, "支付API系统返回失败，请检测Post给API的数据是否规范合法"),
    ON_FAIL_BY_RETURN_CODE_ERROR(1231, "支付请求逻辑错误，请仔细检测传过去的每一个参数是否合法，或是看API能否被正常访问"),
    ON_FAIL_BY_SIGN_INVALID(1232, "支付请求API返回的数据签名验证失败，有可能数据被篡改了"),
    ON_FAIL_BY_AUTHCODE_EXPIRE(1233, "用户用来支付的二维码已经过期，请重新扫一次码"),
    ON_FAIL_BY_AUTHCODE_INVALID(1234, "授权码无效，提示用户刷新一维码/二维码，之后重新扫码支付"),
    ON_FAIL_BY_MONEY_NOT_ENOUGH(1235, "提示用户余额不足，换其他卡支付或是用现金支付"),
    WX_SCAN_ON_FAIL(1236, "支付失败，交易已取消，请重新下单"),
    NOT_FOUNT_MCH_INFO(1237, "找不到支付配置,请联系商家开通此功能！"),
    NOT_FOUNT_APP_INFO(1238, "找不到平台信息,请确认是否有录入平台信息！"),
    DOWNLOAD_ERR(1239, "下载安全证书错误！"),
    ON_WX_REFUND_FAIL(1240, "退款失败,请再重试一次"),
    WX_TRANS_ERR(1241, "有微信的交易数据但没有在交易总表中找到对应的交易数据！"),

    TRANSACTION_ID_IS_NULL(1400, "微信退款ID为空，请联系管理员！"),
    TRANSACTION_IS_BACKED(1401, "该笔交易已经退过，请不要重复操作，如有疑问请联系管理员！"),
    TRANSACTION_STATUS_ERROR(1402, "交易记录状态错误！"),
    TRANSACTION_USE_TICKET_ERROR(1403, "优惠券使用错误，请重试！"),

    WX_CARD_COUPON_STATE_CONSUMED(1243, "已核销"),
    WX_CARD_COUPON_STATE_EXPIRE(1244, "已过期"),
    WX_CARD_COUPON_STATE_GIFTING(1245, "转赠中"),
    WX_CARD_COUPON_STATE_GIFT_TIMEOUT(1246, "转赠超时"),
    WX_CARD_COUPON_STATE_DELETE(1247, "已删除"),
    WX_CARD_COUPON_STATE_UNAVAILABLE(1248, "已失效"),
    WX_CARD_COUPON_STATE_INVALID_CODE(1249, "code未被添加或被转赠领取"),
    ALIPAY_REQUEST_ERR(1250, "付款码过期，让客户刷新后再重新下单！"),
    ALIPAY_REQUEST_NETERR(1250, "支付网络错误，请检查网络连接！"),
    ALIPAY_REQUEST_QUERYERR(1251, "查询支付结果有误，为保险起见，请重新提交订单！"),
    INTERNET_ERROR(1253, "网络连接超时，请检查网络连接情况！"),
    ALIPAY_UNKNOWN_ERR(1257, "发生未知的错误，导致支付没有进行，请重新试一次，如果还不行请选择其他方式，事后需要联系管理员！"),
    ALIPAY_UNKNOWN_REFUND_ERR(1260, "发生未知的错误，导致退款没有进行，请重新试一次，如果还不行请联系管理员！"),
    WX_CARD_COUPON_SIGNATURE_ERR(1261, "微信卡劵签名错误"),
    WX_CARD_COUNPON_USER_GET_ERR(1262, "微信领取会员卡时有一定延迟,请重新进入会员卡"),
    NO_BACK_POINT(1263, "退单失败,因为赠送物品已使用！"),
    Other_Mobile_Take_Up(1264, "修改失败，手机号码已被他人绑定！"),
    OPENID_IS_NULL(1266, "openid为空，无法进行支付！"),
    STOREID_PARAM_ERROR(1267, "该店铺ID有误！"),
    CASHIER_ALREADY_EXISTS(1268, "您已经绑定该店，请不要重复绑定！"),
    NOT_FOUNT_PUBLIC_PLATFORM_TRUSTEESHIP_INFO(1269, "请先将代理商或自己的公众平台托管到本系统！"),
    ON_FAIL_BY_NOT_REVOKE_PRIVILEGES(1270, "支付失败，本应撤销该订单但没有权限！"),
    ON_FAIL_BY_PARAM_ERR_REVOKE_PRIVILEGES(1271, "撤销失败,请求微信接口参数错误！"),
    ON_FAIL_BY_SIGN_INVALID_REVOKE_PRIVILEGES(1272, "撤销失败,撤销接口返回的数据被篡改了！"),
    WX_ORDER_QUERY_PARAM_ERR(1273, "支付订单查询请求逻辑错误，请仔细检测传过去的每一个参数是否合法"),
    WX_ORDER_QUERY_PARAM_ERR_FAIL(1274),//缺少message-----------------------------
    WX_ORDER_QUERY_SIGN_INVALID(1275, "【支付失败】支付请求API返回的数据签名验证失败，有可能数据被篡改了"),
    WX_ORDER_PAY_FAIL_REFUND(1276),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_NOTPAY(1277),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_CLOSED(1278),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_REVOKED(1279),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_USERPAYING(1280),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_PAYERROR(1281),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL_UNKNOW(1282),//缺少message-----------------------------
    WX_ORDER_PAY_FAIL(1283),//缺少message-----------------------------
    WX_ORDER_NO_OUT_TRADE_NO(1284, "交易取消！"),
    WX_REVERSE_REQUEST_ERR(1285, "支付订单撤销请求逻辑错误，请仔细检测传过去的每一个参数是否合法！"),
    WX_REVERSE_REQUEST_RETURN_ERRMSG(1286),//缺少message-----------------------------
    WX_REVERSE_SIGN_INVINID(1287, "【撤销失败】撤销请求API返回的数据签名验证失败，有可能数据被篡改了"),
    CASHIER_LOGIN_NO_SON(1288, "只有分店账号才能被绑定！"),
    WX_REVERSE_REQUEST_RETURN_RECALL_N(1289, "撤销成功！"),
    WX_PAY_SUC(1290, "已经付款成功！"),
    onFailByQuerySignInvalid(1291, "查询请求API返回的数据签名验证失败，有可能数据被篡改了！"),
    onFailByQueryOthersErr(1292),//缺少message-----------------------------
    query_net_err(1293, "网络错误，请重新请求！"),
    AUTH_CODE_INVALID(1294, "请输入有效的条码或二维码！"),
    Load_Certificate_Net_Err(1295, "连接网络时,加载安全证书出错,请重试!"),
    YY_KEY_ERR(1296, "传入的key有误，请检查！"),
    YY_REQUEST_TOTALFEE_ERR(1297, "传入的金额不能为零，请检查！"),
    YY_REQUEST_BODY_ERR(1298, "传入的商品描述不能为空，请检查！"),
    WX_INTERFACE_VALIDATE_ERR(1299, "微支付接口身份验证不通过"),
    NOT_PROXY_MCH(1300, "不是代理账号，没有权限！"),
    MOBILE_OR_OTHERMOBILE_SAME(1301, "同一个品牌存在多个相同账号或手机号，请联系品牌商！"),
    JSPAY_REQUEST_OPENID_IS_NULL(1303, "请求参数有误，openid为空！"),
    JSPAY_REQUEST_MONEY_IS_ZERO(1304, "请求参数有误，金额为零！"),
    JSPAY_REQUEST_NOTIFYURL_IS_NULL(1305, "请求参数有误，回调地址为空！"),
    JSPAY_REQUEST_BOBY_IS_NULL(1306, "请求参数有误，标题为空！"),
    CERTIFICATE_DECRYPTION_ERROR(1302, "证书错误,请联系安装人员"),
    EXPLAN_CLASH_DATE(1307, "该执行计划周期与其他执行计划冲突!"),
    EXPLAN_CLASH_NAME(1308, "该执行计划名称已存在"),
    GETHTTPCLIENT_ERR(1309, "获取HttpClient错误!"),
    QPAY_RETURN_NULL(1310, "财付通返回数据为空,请稍后重试!"),
    QPAY_NET_ERR(1311, "服务器网络连接失败！"),
    QPAY_REFUND_FAIL(1312, "退款失败,需要商户在商户平台手动退款！"),
    QPAY_REFUND_FAIL_ERR_BANKNO(1313, "客户银行账户有误，钱已退回商户财付通账户，请商户通过其它方式退款给用户!"),
    QPAY_TO_REVERSE(1314, "由于用户30s内没有输入密码，本次交易已取消，请重新发起支付！"),
    QJSPAY_GET_TOKENID_ERR(1315, "未知错误！"),
    QPAY_MISSING_PARAMETERS(1316, "缺少必填参数！"),
    QJSPAY_MISSING_MCHINFO(1317, "找不到手Q商户信息！"),
    QJSPAY_DOWNLOAD_CER_ERR(1318, "下载安全证书错误，服务器网络异常！"),
    QJSPAY_TRANS_MISSING(1319, "不存在当前记录！"),
    QJSPAY_TRANS_STATUS_ERR(1320, "当前记录状态有误，不满足退款条件！"),
    QPAY_ORDER_CANCEL(1321, "订单已取消，请重新发起支付！"),
    QPAY_STATUS_UNKNOW(1322, "该订单状态无法确认，请手动查询一次！"),
    IS_NOT_QQ_PROXY_MODEL(1323, "没有找到该商户的代理商！"),
    COUPON_IS_NOEXIST(1324, "优惠劵不存在"),
    INVALID_KEYSPEC(1325, "密钥错误,请重新配置支付信息"),
    WEIXINPAY_CONFIG_ERR(1326, "微信支付配置有误,请联系商户重新配置!"),
    REPETITIVE_OPERATION(1327, "重复操作了,请确认刚才是否操作成功"),//这是数据乐观锁出现错误的提示
    STORE_NONSUPPORT_SINCE(1328, "店铺不支持自提"),
    REPEAT_CONCERNS(1329, "已关注"),
    TICKET_CODE_ERROR(1330, "优惠券编码错误！"),
    CARD_NOTFOUND(1331, "会员卡不存在！"),
    RANDOM_AMOUNT_IS_NOT_CORRECT(1332, "随机金额格式不正确"),

    CARD_LOCKED_OUT(1334, "会员卡已锁定！"),
    TITLE_EXISTS(1335, "标题已存在！"),
    MEMBERS_LACK_ONE_PERSON(1336, "会员数不足一人"),
    PARENT_STORE_NOT_EXISTS(1337, "总店不存在"),
    WX_ACTIVITY_ADD_FAILURE(1338, "微信活动添加失败"),
    WX_ACTIVITY_NOT_EXIST(1339, "微信活动不存在"),
    TICKET_NOT_EXIST(1340, "优惠券不存在"),
    WX_ACTIVITY_NOT_OPEN(1341, "微信活动未开启"),
    PRODUCT_BUY_COUNT_INSUFFICIENT(1342, "商品购买数量不足"),
    PRODUCT_AND_TICKET_NOT_MATCH(1343, "商品和优惠券不匹配"),
    OLD_PASSWORD_ERROR(1344, "旧密码错误"),
    PLACE_THE_ORDER_FAILED(1345, "下单失败"),
    MEMBER_REGISTRATION_FAILED(1347, "会员注册失败"),
    NOT_SELECT_PRODUCT(1348, "没有选择商品"),
    STORE_LOCK(1349, "门店已锁定"),
    CARD_MOBILT_NOT_MATCH(1350, "卡号和手机不匹配"),
    CARD_NOT_ACTIVATE(1351, "会员卡未激活"),
    TICKET_USE(1352, "优惠券已使用"),
    MOBILE_NOT_MATCH_BIND_MOBILE(1353, "手机号与会员卡绑定的手机号不匹配"),
    POSNO_EXIST(1354, "此POS编号已存在"),
    ILLEGAL_ACCESS(1355, "非法访问，请停止现在的操作！"),
    ACCOUNT_NOT_ACTIVATED(1356, "账号未激活"),
    MYSQL_DATA_DUPLICATED(1357, "数据库数据一样，忽略插入"),
    MYSQL_DATA_NOTEXISTS(1358, "数据库数据不存在"),
    TRANSACTION_NOT_EXIST(1359, "订单不存在！"),
    POSID_EXIST(1340, "POS ID已存在"),

    //	ORDERS 错误段2000-2010
    ORDERS_NO_PRODUCTS(2001, "POS商品不能为空"),
    ORDERS_NO_ORDERNUM(2002, "订单号不能为空"),

    ORDERS_NOT_MATCH_CARD(2003, "订单和卡号不匹配"),
    ORDERS_OK(2004, "订单已支付成功"),
    ORDERS_NO_SEQUENCE(2005, "订单流水号不能为空！"),
    ORDERS_IS_OVER(2006, "退款失败，订单已结单！"),
    ORDERS_CANCEL_NO_PAYMENT(2007, "退款失败，订单未支付！"),
    ORDERS_INTERESTS_NO_PAYMENT(2008, "计算权益必须是订单已支付状态"),

    /**
     * pos接口-订单结算 错误信息
     */
    POSAPI_PAYMENT_ERROR( 10000,"支付方式与金额未传入，请重试" ),
    POSAPI_AMOUNT_ERROR( 10001,"应付金额amount 不能小于 实付金额total" ),
    POSAPI_PAYMENT_NOTEQUAL_TOTAL(10002, "实付金额 必须等于 所有支付类型的总额"),
    POSAPI_PAYMENT_ORDER_ISCANCEL(10003, "订单已失效"),
    POSAPI_PAYMENT_NOPRODUCT(10004,"商品不能为空！"),
    POSAPI_PAYMENT_ORDER_EXIST(10005, "该订单流水号已入单,请勿重复调用！"),


    /**
     * pos接口-用券相关接口 vertification/cancel
     */
    POSAPI_COUPON_NO_SESSION(10010,"无法找到对应的sessionId，可能已经被删除，请重新用券"),
    POSAPI_COUPON_NO_SEQUENCE(10011,"无法找到对应的posSequence，请重新点单并使用优惠券"),
    POSAPI_COUPON_CANCEL_ONEONLY(10012,"一次只能撤销一张优惠券，并且只能撤销最后使用的一张"),
    POSAPI_COUPON_PRODUCT_GIFTCOUNT_P2(10013,"{0} 的商品数量不足，还需再点购{1,number}个"),
    POSAPI_COUPON_NOTSUPPORT(10014,"此券不支持POS端核销"),
    POSAPI_COUPON_CASH_LIMIT_P1(10015,"{0} 单笔订单只能使用一张"),
    POSAPI_COUPON_DISCOUNT_LIMIT_P1(10016,"{0} 单笔订单只能使用一张"),
    POSAPI_COUPON_GOODS_LIMIT_P1(10017,"{0} 单笔订单只能使用一张"),
    POSAPI_COUPON_BUY_SEND_LIMIT_P1(10018,"{0} 单笔订单只能使用一张"),
    POSAPI_COUPON_PRIVILEGE_LIMIT_P1(10019,"{0} 单笔订单只能使用一张"),
    POSAPI_COUPON_TIME_P2(10020,"{0} 券使用日期未到 {1}"),
    POSAPI_COUPON_EXPIRE_P2(10021,"{0} 券已过使用日期 {1}"),
    POSAPI_COUPON_SELECTED_LIMIT_P2(10022,"{0} 不能与 {1} 同时使用"),
    POSAPI_COUPON_CALCULATE_WRONG_P1(10030,"{0} 优惠券折扣计算错误"),
    POSAPI_COUPON_MODE_NO_SEQUENCE(10023,"请使用无唯一订单号模式"),


    /**
     * openpos接口 错误信息
     */
    OPENAPI_PRODUCT_SYNC_DENY(10100, "同步失败，总店后台的POS商品同步开关未开启"),
    OPENAPI_PRODUCT_SYNC_INVALID_FLAG0(10101,"不当的数据参数，同步菜单数据时，不存在的商品数据却有设定FLAG=0"),
    ;

    /**
     * 错误code
     *
     * @author guoyu
     */
    private int code;

    /**
     * 错误信息
     *
     * @author guoyu
     */
    private String message;

    private int type;

    /**
     * 中文提示,一般情况下用不到,只有之前 xpi过渡到中文提示的版本有使用
     *
     * @author guoyu
     */
    private String cnMessage;

    ErrorEnum1(int code) {
        this.code = code;
    }

    ErrorEnum1(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ErrorEnum1(int code, String message, String cnMessage) {
        this.code = code;
        this.message = message;
        this.cnMessage = cnMessage;
    }

    ErrorEnum1(int code, String message, int type) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public String getCnMessage() {
        return cnMessage;
    }

}