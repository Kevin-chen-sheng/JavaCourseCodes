

## CFS+RFS+RES总结

|                   file_name                    |                            入参数                            | 出参数                                                       | file_class                                 | input_map                                               | output                                                       | desc                                                         |
| :--------------------------------------------: | :----------------------------------------------------------: | ------------------------------------------------------------ | ------------------------------------------ | ------------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
|        ct-api-5GLineCircuitType.groovy         |               value,circuitType,orgProductCode               | true/fasle                                                   | Is5GLineCircuitType                        | [serviceOrder:"",value:""]                              | Boolean                                                      |                                                              |
|  ct-api-5GSetProdInfoFromPublicParams.groovy   |                    attrCodes,prodInstance                    | retMap                                                       | SetProductinfoValuesFromPublicParams       | [serviceOrder:"",attrCodes:""]                          | retMap(json对象)                                             |                                                              |
|          ct-api-CompTwoParams.groovy           |          attrCode1,attrValue1,attrCode2,attrValue2           | retMap                                                       | CompTwoParams                              | [attrCode1:"",attrValue1:"",attrCode2:"",attrValue2:""] | retMap(json对象)                                             |                                                              |
|           ct-api-defaultValue.groovy           |                         defaultValue                         | defaultValue                                                 | NsoSpRuleExecGetDefaultValueServiceImpl    | [defaultValue:""]                                       | .defaultValue(object)                                        | 直接返回键为defaultValue的值                                 |
|         ct-api-Get5QIValueRule.groovy          |                  LineType5G,LineSceneType5G                  | qiValues.get(key）\|\|“”;                                    | Get5QIValueRule                            | [serviceOrder:""]                                       | qiValues.get(key)                                            | qiValues = ['1002-1004':'71','1002-1003':'83','1002-1002':'4'] |
|   ct-api-GetCoreNetSliceSignPhoneRule.groovy   |                    phoneNumbers，loopVar                     | result = '86' + phoneNOArr.getAt(loopVar);                   | GetCoreNetSliceSignPhoneRule               | [phoneNumbers:"",loopVar:""]                            | '86' + phoneNOArr.getAt(loopVar)                             | String[] phoneNOArr = phoneNumbers.split(",")                |
|             ct-api-getEvent.groovy             |                            value                             | INSTALL\|MODIFY\|REMOVE\|“”                                  | NspSoRuleGetEventServiceImpl               | [value:""]                                              | String valueStr = (String)tacticParams.get("value")          | "INSTALL"\|"MODIFY"\|"REMOVE"\|""                            |
|            ct-api-getNumbers.groovy            |                            value                             | Integer.valueOf(value)+1                                     | NpSspRuleExecValueGetNumberServiceImpl     | [value:""]                                              | Integer.valueOf(valueStr) +1\|\|0                            | if(valueStr == null \|\| "".equals(valueStr) \|\| "null".equals(valueStr))  {return 0} |
|           ct-api-getOneParam.groovy            |                     attrCode，attrValue                      | retMap                                                       | CompOneParams                              | [attrCode:"",attrValue:""]                              | retMap(json对象)                                             | retMap.put(tacticParams.attrCode,**((String)tacticParams.attrValue).trim()**) |
|           ct-api-getValueRule.groovy           |                          value,path                          | map                                                          | NpSspRuleExecGetValueFromObjectServiceImpl | [value:"",path:""]                                      | map??                                                        | tacticParams.path.replaceAll('].',',').replaceAll(']',',').split(',').each{} |
|   ct-api-IsNeed5GCoreNetSliceSignRule.groovy   |                     phoneNumbers,loopVar                     | loopVar < phoneNOArr.length-1?true:false                     | IsNeed5GCoreNetSliceSignRule               | [phoneNumbers:"",loopVar:""]                            | if(loopVar < phoneNOArr.length-1){     result = true; }      | String[] phoneNOArr = phoneNumbers.split(",")                |
|  ct-api-IsNeedIPRANPWResourceQueryRule.groovy  |                          ZProvince                           | PROVINCES.indexOf(provinceCode) > -1?true:false              | IsNeedIPRANPWResourceQueryRule             | [serviceOrder:""]                                       | if(PROVINCES.indexOf(provinceCode) > -1 ){     result = true; } | def provinceCode = Eval.x(serviceOrder, "x.serviceOrder[0].prodInstance[0].ZProvince") |
| ct-api-IsNot5GIpranLineCircuitTyperRule.groovy |                         circuitType                          | "1001".equals(circuitType)?false:true                        | IsNot5GIpranLineCircuitType                | [serviceOrder:""]                                       | //5G+IPRAN if("1001".equals(circuitType)){     result = false; } | def prodInstance = Eval.x(serviceOrder,"x.serviceOrder[0].prodInstance[0]");  String circuitType = Eval.x(prodInstance,'x.circuitType'); |
|        ct-api-CompNetGatewayRule.groovy        |                  ZIntranetAddr,ZSubNetCode                   | ZIntranetAddr + "/" + ZSubNetCode                            | CompNetGatewayRule                         | [serviceOrder:""]                                       | retStr                                                       | retStr = Eval.x(prodInstance, "x.ZIntranetAddr") + "/" + Eval.x(prodInstance, "x.ZSubNetCode"); |
|         ct-api-Is5GLineTypeRule.groovy         |                       LineType5G,value                       | value.equals(LineType5G)?true:false                          | Is5GZXLine                                 | [serviceOrder:""]                                       | //5G尊享专线            if(tacticParams.value.equals(lineType5G)){                result = true;            } | def prodInstance = Eval.x(serviceOrder,"x.serviceOrder[0].prodInstance[0]");            String lineType5G = Eval.x(prodInstance,'x.LineType5G'); |
|        ct-api-Set5GLineExtraInfo.groovy        |     prodInstance,attrCodes,testDate(比2号多了个testDate)     | retMap                                                       | SetProductinfoValuesFromPublicParams       | [serviceOrder:"",attrCodes:"",testDate:""]              | retMap(json对象)                                             | attrCodes.each {                    attrs = it.split('#');                    retMap.put(attrs[0],Eval.x(prodInstance,'x.'+ attrs[1]))                }; |
|      ct-api-FLOW-DNN-SLICES-ROUTER.groovy      | orgProductCode，circuitType，PROD_5G_SLICES_LINE，PROD_5G_UPF，PROD_5G_5G | (PROD_5G_SLICES_LINE.equals(orgProductCode) && (PROD_5G_5G.equals(circuitType) \|\| PROD_5G_UPF.equals(circuitType)))?true:false | FlowDNNRouterService                       | [serviceOrder:""]                                       | Boolean.toString(result);                                    | PROD_5G_SLICES_LINE.equals(prodCode) &&(PROD_5G_5G.equals(circuitType)\|\|PROD_5G_UPF.equals(circuitType) |
|       ct-api-getSliceAreaCodeRule.groovy       | PROD_5G_NET_SLICES，PROD_5G_SLICES_LINE，orgProductCode，ACity，lanId | ACity\|lanId\|“”                                             | getSliceAreaCodeRule                       | [serviceOrder:""]                                       | result                                                       | if(PROD_5G_SLICES_LINE.equals(prodCode)){            result = Eval.x(prodInstance[0],'x.ACity');        }		if(PROD_5G_NET_SLICES.equals(prodCode)){            result = Eval.x(prodInstance[0],'x.lanId');        } |
|     ct-api-Is5GLineSHcircuitType5G.groovy      |            circuitType，AProvince，orgProductCode            | (("1004".equals(circuitType))&("6601052000".equals(orgProductCode)))&&(AProvince !=null && !''.equals(AProvince.trim()))&&(PROVINCES.indexOf(AProvince) > -1 )?true:false | Is5GLineSHcircuitType5G                    | [serviceOrder:""]                                       | Boolean.toString(result)                                     | if(("1004".equals(circuitType))&("6601052000".equals(orgProductCode))){			if(provinceCode !=null && !''.equals(provinceCode.trim())){                    if(PROVINCES.indexOf(provinceCode) > -1 ){                        result = false;                    }                }            } |
|          ct-api-Is5GSLICELINE.groovy           |                        orgProductCode                        | "6601052000".equals(orgProductCode)?true:false               | Is5GSLICELINE                              | [serviceOrder:""]                                       | Boolean.toString(result)                                     | if("6601052000".equals(orgProductCode)){				result = true;            } |
|              ct-api-UeRule.groovy              |                         ueFlag,type                          | "是"\|“否”                                                   | **GetCoreNetSliceSignPhoneRule**？？？     | [ueFlag:"",type:""]                                     | return "是"\|\|"否"                                          | if(type.equals("inner") && ueFlag.equals("1000")){            return "是";        } else if(type.equals("inner") && ueFlag.equals("1001")) {            return "否"; |
|           ct-api-valueCompare.groovy           |                       value,compareStr                       | Arrays.binarySearch(compareStrArray, value) >= 0?true:false  | ValueCompare                               | [value:"",compareStr:""]                                | Boolean.toString(result)                                     | if (value != null && value.length() > 0) {            //判断是否包含            String[] compareStrArray = compareStr.split(",");            result = Arrays.binarySearch(compareStrArray, value) >= 0;        } |
|             ct-api-enumStr.groovy              |                          type,value                          | (value != null && value.equals(mm.get("enumCode")))?true:false | NpSspRuleExecValidateEmptyServiceImpl      | [type:"'',value:""]                                     | return true;                                                 | if (value != null && value.equals(mm.get("enumCode"))) {                result = mm.get("enumValue");                return true;            } |
|         ct-api-Is5GSNSSAIQUERY.groovy          |          LineType5G,LineSliceType5G,orgProductCode           | (("1001".equals(LineType5G))&("6601052000".equals(orgProductCode))&("1002".equals(LineSliceType5G)))?true:false | Is5GSNSSAIQUERY                            | [serviceOrder:""]                                       | Boolean.toString(result);                                    | if(("1001".equals(LineType5G))&("6601052000".equals(orgProductCode))&("1002".equals(LineSliceType5G))){ 			result = true;            } |
|         ct-api-IsNeedOTNNOTICE.groovy          |                    AProvince,circuitType                     | (PROVINCES.indexOf(AProvince) > -1 )&("1002".equals(circuitType)))?true:false | IsNeedOTNNOTICE                            | [serviceOrder:""]                                       | return result;                                               | if(provinceCode !=null && !''.equals(provinceCode.trim())){                    if((PROVINCES.indexOf(provinceCode) > -1 )&("1002".equals(circuitType))){                        result = true;                    }                 } |
|     ct-api-Is5GLineSHcircuitTypeRES.groovy     |                   AProvince,orgProductCode                   | ("6601052000".equals(orgProductCode))&&(AProvince !=null && !''.equals(AProvince.trim()))&&(PROVINCES.indexOf(AProvince) > -1 )?true:false | Is5GLineSHcircuitTypeRES                   |                                                         |                                                              |                                                              |
|       ct-api-getIpAddressOrAIsdn.groovy        |                    loopVar,arrayData,type                    | result.aIsdn[loopVar]\|\|result.ipAddress[loopVar]           | getIpAddressOrAIsdn                        |                                                         |                                                              |                                                              |
|      ct-api-GetPCFDNNTemplateRule.groovy       |    LineTerminalUpSpeed5G,LineTerminalDownSpeed5G,qi5Value    | pcfTemplates.containsKey(key)?pcfTemplates.get(key):"GBR-71-UD-2M" | GetPCFDNNTemplateRule                      |                                                         |                                                              |                                                              |
|      ct-api-GetUDMDNNTemplateRule.groovy       |         LineType5G,qi5Value,upRateCode,downRateCode          | dnnTemplates.containsKey(key)?dnnTemplates.get(key):""       | GetUDMDNNTemplateRule                      |                                                         |                                                              |                                                              |

| 流程规则类型     | 规则分类                                   | 规则实现方式 |
| ---------------- | ------------------------------------------ | ------------ |
| 属性约束规则     | 产品属性之间约束                           | 正则表达式   |
| 属性映射规则     | 产品属性与销售品约束                       | 决策表       |
| 协同依赖规则     | 同一销售品构成下不同产品之间的属性取值联动 | groovy脚本   |
| 异常处理规则     | 产品关系的规则约束                         |              |
| 路由执行规则     | 销售品之间属性取值约束                     |              |
| 流程适配规则     | 功能产品与营销资源属性依赖约束             |              |
| 环节协同依赖规则 | 产品关系与产品的规则约束                   |              |

1.创建规则，

2.引用规则，没有的话，自己写，选dmn和groovy

```
public String exec1(String value,String circuitType,String orgProductCode) {
        def result=false;
        if((value.equals(circuitType))&("6601052000".equals(orgProductCode))){
            result = true;
        }
        return Boolean.toString(result);
    }
```

```
if value==circuitType and 6601052000==orgProductCode then true else false
```

```
def String exec1( attrCodes,Map<String,Object> prodInstance) {
        def retMap = [:];
        //def prodInstance = Eval.x(serviceOrder,"x.serviceOrder[0].prodInstance[0]");
        attrCodes = attrCodes.split(',');
        def attrs;

        attrCodes.each {
            attrs = it.split('#');
            retMap.put(attrs[0],Eval.x(prodInstance,'x.'+ attrs[1]))
        };
        return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(retMap);
    }
```

```
attrCodes==1#circuitType,2#orgProductCode
map2 = ["circuitType":"circuitTypeValue","orgProductCode":"6601052000"]
##组装数据,返回map
if attrCodes ... then return return retMap
##
retMap = {"1":"circuitTypeValue","2":"6601052000"}
```

```
##组装数据，返回字符串
public String exec1(ZIntranetAddr,ZSubNetCode) {
        String retStr = "";
        def prodInstance = Eval.x(serviceOrder, "x.serviceOrder[0].prodInstance[0]");
        retStr = ZIntranetAddr + "/" + ZSubNetCode
        return  retStr;
    }
```

```
if ZIntranetAddr... then return retStr
```

```
##组装数据,返回map
def String exec1(String attrCode1,String attrValue1,String attrCode2,String attrValue2){
        def retMap = [:];

        retMap.put(attrCode1,((String)attrValue1).trim());
        retMap.put(attrCode2,((String)attrValue2).trim());

        return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(retMap);
    }
```

```
if .... then return retMap
```

```
##返回字符串
def String exec1(String defaultValue) {
        return defaultValue
    }
```

```
if ... then return defaultValue
```

```
#type == List<Map>
##返回正负
public Boolean exec1( type,  value) {

        def result = "";
        for (Map mm : type) {
            if (value != null && value.equals(mm.get("enumCode"))) {
                result = mm.get("enumValue");
                return true;
            }
        }
        //(value != null && value.equals(mm.get("enumCode")))?true:false
        return false;

    }
```

```
##value==type中key为enumCode对应的value值
##返回正负
if (value != null && value==type中key为enumCode对应的value值) {
                return true;
            } then return false
```

```
##返回正负
public String exec1(orgProductCode,circuitType,PROD_5G_SLICES_LINE,PROD_5G_UPF,PROD_5G_5G) {
        boolean result = false;
//        def prodInstance = Eval.x(serviceOrder,"x.serviceOrder[0].prodInstance");
//        String prodCode = Eval.x(prodInstance[0],'x.orgProductCode');   //CRM产品编码
//        String circuitType = Eval.x(prodInstance[0],'x.circuitType');  //组网模式
        //5G切片专线  5G场景 时
        if(PROD_5G_SLICES_LINE.equals(orgProductCode) && (PROD_5G_5G.equals(circuitType) || PROD_5G_UPF.equals(circuitType))){
            result = true;
        }
        (PROD_5G_SLICES_LINE.equals(orgProductCode) && (PROD_5G_5G.equals(circuitType) || PROD_5G_UPF.equals(circuitType)))?true:false
        return Boolean.toString(result);
    }
//&&是且，||是或，A且B求出结果，再与C求或如果A且B是真，那么结果是真
如果A且B是假，C是真，那么结果是真
如果A且B是假，C也假，那么结果为假
```

```
if orgProductCode==PROD_5G_SLICES_LINE and circuitType==PROD_5G_5G return true
else circuitType==PROD_5G_UPF return true
else false
```

```
public String exec1(LineType5G,LineSceneType5G) {
        def qiValues = ['1002-1004':'71','1002-1003':'83','1002-1002':'4','1001-1001':'7','1001-1003':'80','1001-1002':'70'];
        //def prodInstance = Eval.x(serviceOrder,"x.serviceOrder[0].prodInstance[0]");

        def key =  LineType5G+ '-' + LineSceneType5G;

        if(qiValues.containsKey(key)){
            return qiValues.get(key);
        }
        return  ""
    }
```

```
//Both LineType5G and LineSceneType5G are String type
Function Get5QIValueRule(LineType5G,LineSceneType5G)
{
	qiValues <- ['1002-1004':'71','1002-1003':'83','1002-1002':'4','1001-1001':'7','1001-1003':'80','1001-1002':'70']
	//组装key
	key <- LineType5G+ '-' + LineSceneType5G
	//返回map中对应的值
	return qiValues.get(key)
}
END Get5QIValueRule

```

```
public String exec1(String phoneNumbers,String loopVar) {
        def result = "";
        loopVar = Integer.valueOf(tacticParams.loopVar);

        if(phoneNumbers != null && !"".equals(phoneNumbers)){
            String[] phoneNOArr = phoneNumbers.split(",");

            if(loopVar>-1 && loopVar < phoneNOArr.length){
                result = '86' + phoneNOArr.getAt(loopVar);
            }

        }
        return result;
    }
```

```

//Both phoneNumbers and loopVar are String type
Function GetCoreNetSliceSignPhoneRule(phoneNumbers,loopVar)
{
	loopVar <- Integer.valueOf(loopVar)
	//phoneNOArr is String[] 
	phoneNOArr <- phoneNumbers.split(",")
	if(loopVar > -1 && loopVar < phoneNOArr.length){
         result <- '86' + phoneNOArr.getAt(loopVar);
         //返回字符串
         return result
    }
    return ""
}
END GetCoreNetSliceSignPhoneRule
```

```
public String exec1(String value) {
        if("INSTALL".equals(value)){
            return "INSTALL";
        }
        else if("MODIFY".equals(value)){
            return "MODIFY";
        }
        else if("REMOVE".equals(value)){
            return "REMOVE";
        }
        return "";
    }
```

```
//value is String type
Function NspSoRuleGetEventServiceImpl(value)
{
	if "INSTALL"==value then{
		return "INSTALL"
	}elseif "MODIFY"==value then{
		return "MODIFY"
	}elseif "REMOVE"==value then{
		return "REMOVE"
	}else{
		return ""
	}
}
END NspSoRuleGetEventServiceImpl
```

```
public String exec2(loopVar,arrayData,String type) {
        def i = Integer.valueOf(loopVar)
        def slurper = new JsonSlurper();
        def result = slurper.parseText(arrayData);

        if("aIsdn" == type){
            return  result.aIsdn[i];

        }else if("ipAddress" == type){
            return  result.ipAddress[i];
        }

    }
```

```
//Both loopVar and type are String type;arrayData is map
Function GetIpAddressOrAIsdn(loopVar,arrayData, type)
{
	//表示map中的位置
	i = Integer.valueOf(loopVar)
	//判断取哪种值
	if "aIsdn"==type then{
		return result.aIsdn[i]
	}elseif "ipAddress"==type then{
		return result.ipAddress[i]
	}
	else{
		return ""
	}
}
END GetIpAddressOrAIsdn
```

```
public String exec1(String value) {
        if(value == null || "".equals(value) || "null".equals(value)){
            return 0;
        }
        return Integer.valueOf(value)+1
    }
```

```
//value is String type
Function NpSspRuleExecValueGetNumberServiceImpl(value)
{
	return Integer.valueOf(value)+1
}
END NpSspRuleExecValueGetNumberServiceImpl
```

```
def String exec1(attrCode,attrValue){
        def retMap = [:];
        retMap.put(attrCode,((String)attrValue).trim());
        return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(retMap);
    }
```

```
//Both attrCode and attrValue are String type
Function CompOneParams(attrCode,attrValue)
{
	//空map
	retMap <- [:]
	retMap <- [attrCode:attrValue]
	//组装map
	return retMap
}
END CompOneParams
```

```
public String exec1(String LineTerminalUpSpeed5G,String LineTerminalDownSpeed5G,String qi5Value) {
        def pcfTemplates = [
                '2M-2M-71':'GBR-71-UD-2M',
                '5M-5M-71':'GBR-71-UD-5M',
                '10M-10M-71':'GBR-71-UD-10M',
                '20M-20M-71':'GBR-71-UD-20M',
                '50M-50M-71':'GBR-71-UD-50M',
                '2M-64K-71':'GBR-71-UL-2M',
                '5M-64K-71':'GBR-71-UL-5M',
                '10M-64K-71':'GBR-71-UL-10M',
                '20M-64K-71':'GBR-71-UL-20M',
                '50M-64K-71':'GBR-71-UL-50M',
                '64K-2M-71':'GBR-71-DL-2M',
                '64K-5M-71':'GBR-71-DL-5M',
                '64K-10M-71':'GBR-71-DL-10M',
                '64K-20M-71':'GBR-71-DL-20M',
                '64K-50M-71':'GBR-71-DL-50M',
                '2M-2M-83':'GBR-83-UD-2M',
                '5M-5M-83':'GBR-83-UD-5M',
                '10M-10M-83':'GBR-83-UD-10M',
                '20M-20M-83':'GBR-83-UD-20M',
                '50M-50M-83':'GBR-83-UD-50M',
                '2M-64K-83':'GBR-83-UL-2M',
                '5M-64K-83':'GBR-83-UL-5M',
                '10M-64K-83':'GBR-83-UL-10M',
                '20M-64K-83':'GBR-83-UL-20M',
                '50M-64K-83':'GBR-83-UL-50M',
                '64K-2M-83':'GBR-83-DL-2M',
                '64K-5M-83':'GBR-83-DL-5M',
                '64K-10M-83':'GBR-83-DL-10M',
                '64K-20M-83':'GBR-83-DL-20M',
                '64K-50M-83':'GBR-83-DL-50M',
                '2M-2M-4':'GBR-4-UD-2M',
                '5M-5M-4':'GBR-4-UD-5M',
                '10M-10M-4':'GBR-4-UD-10M',
                '20M-20M-4':'GBR-4-UD-20M',
                '50M-50M-4':'GBR-4-UD-50M',
                '2M-64K-4':'GBR-4-UL-2M',
                '5M-64K-4':'GBR-4-UL-5M',
                '10M-64K-4':'GBR-4-UL-10M',
                '20M-64K-4':'GBR-4-UL-20M',
                '50M-64K-4':'GBR-4-UL-50M',
                '64K-2M-4':'GBR-4-DL-2M',
                '64K-5M-4':'GBR-4-DL-5M',
                '64K-10M-4':'GBR-4-DL-10M',
                '64K-20M-4':'GBR-4-DL-20M',
                '64K-50M-4':'GBR-4-DL-50M',

        ];
        def key = LineTerminalUpSpeed5G  +"-"+ LineTerminalDownSpeed5G +"-" + qi5Value;
        //println("pcfTemplates: " + key)

        if(pcfTemplates.containsKey(key))
            return pcfTemplates.get(key);

        //pcfTemplates.containsKey(key)?pcfTemplates.get(key):"GBR-71-UD-2M"
        return "GBR-71-UD-2M";
    }
```

```
if
```

