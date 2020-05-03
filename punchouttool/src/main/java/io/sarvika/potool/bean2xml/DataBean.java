package io.sarvika.potool.bean2xml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 <!-- https://mvnrepository.com/artifact/com.unilog.cimmesb.schema/cimmesb-schema-cxml -->
 <dependency>
 <groupId>com.unilog.cimmesb.schema</groupId>
 <artifactId>cimmesb-schema-cxml</artifactId>
 <version>3.2.2-RELEASE</version>
 </dependency>
 * 报文头-[报文基础信息]
 */
@XmlRootElement(name = "data_bean")
public class PunchOutRequest {

    private String cXML;

    private String cXML_payloadID;

    private String cXML_timestamp;

    private
}
