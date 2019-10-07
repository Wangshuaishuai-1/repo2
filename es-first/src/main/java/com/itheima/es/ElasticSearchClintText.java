package com.itheima.es;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;

public class ElasticSearchClintText {
    private TransportClient client;
    @Before
    public void init ()throws Exception{
        //      创建一个settings对象(接收集群名)
        Settings settings = Settings.builder().put("cluster.name", "my_elasticsearch").build();
//     创建一个客户端对象client（导入每个节点的访问端口号，避免有一个服务器出现问题干扰正常工作）
        client=new PreBuiltTransportClient(settings);
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"),9301));
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"),9302));
        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"),9303));
    }

    @Test
    public void  CreatIndex() throws Exception {
//        创建索引库
        client.admin().indices().prepareCreate("'index_hello").get();
//        关闭索引库
    }
}
