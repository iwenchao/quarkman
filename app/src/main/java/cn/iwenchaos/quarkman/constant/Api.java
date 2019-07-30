package cn.iwenchaos.quarkman.constant;

/**
 * Created by chaos
 * on 2019/7/30. 23:38
 * 文件描述： 网络请求接口地址
 * <p>
 * 有签名，到时候看，如果不行，则映射到本地
 */
public final class Api {

    /**
     * 每日妙读
     */
    public static final String URL_DAYLY_READ_CARD = "http://ai.sm.cn/quark/1/api?method=card&format=json";
    public static final String URL_DAYLY_READ_CARD_LIST = "http://miaodu.sqreader.com/v2/recommend/index?ch=2001&encryptType=-1&mt=Pixel-2-XL&pt=1001&token=kuake000000000&ts=1564500925774&uid=AAOJRO_w8uWS5if0RdUx3nSCZ1jxI7iqBS-HNe_6ti2wUA&utdId=AAOJRO_w8uWS5if0RdUx3nSCZ1jxI7iqBS-HNe_6ti2wUA&ver=1.0.0.8&sign=270d927c30a5b9d7b3951d509b564a13561c5621";


    /**
     * 我的关注
     */
    public static final String URL_USER_FOCUS = "https://iflow.uczzd.cn/quarkapi/api/v1/user/follow?&ut=AAOJRO%2Fw8uWS5if0RdUx3nSCZ1jxI7iqBS%2BHNe%2F6ti2wUA%3D%3D&ds=AAOJRO%2Fw8uWS5if0RdUx3nSCZ1jxI7iqBS%2BHNe%2F6ti2wUA%3D%3D&dn=22517458636-4567da83&fr=android&pf=3300&bi=35927&ve=3.3.2.112&ss=1440x2737&mi=Pixel+2+XL&ni=bTkwBO43bd%2BFmeh08%2FDsPTImTWOxe2jrf%2BB7XwS77YLCkcE%3D&la=zh&nt=5&nw=0&kt=4&pr=ucpro&sv=release&os=9";
}
