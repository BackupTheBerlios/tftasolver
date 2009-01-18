<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1232278495091" ID="ID_217096451" MODIFIED="1232282696099" STYLE="bubble" TEXT="Law Of Completeness">
<node CREATED="1232278899857" ID="ID_135624097" MODIFIED="1232282756360" POSITION="right" STYLE="bubble" TEXT="Basic Event&#xa;(TTFTAObject.IsBasicEvent)">
<node CREATED="1232278927070" ID="ID_1247686613" MODIFIED="1232282696105" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279093505" ID="ID_885914295" MODIFIED="1232282696106" POSITION="right" STYLE="bubble" TEXT="SAND Term&#xa;(TTFTAObject.IsTypeSAND)">
<node CREATED="1232278927070" ID="ID_1284299152" MODIFIED="1232282696111" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279093505" ID="ID_1357048076" MODIFIED="1232282696111" POSITION="right" STYLE="bubble" TEXT="PAND Term&#xa;(TTFTAObject.IsTypePAND)">
<node CREATED="1232278927070" ID="ID_192855482" MODIFIED="1232282696119" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279544201" ID="ID_1148144023" MODIFIED="1232282696120" POSITION="right" STYLE="bubble" TEXT="OR Term&#xa;(TTFTAObject.IsTypeOR)">
<node CREATED="1232278927070" ID="ID_1521072097" MODIFIED="1232282696125" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279550059" ID="ID_1444395368" MODIFIED="1232282696125" POSITION="right" STYLE="bubble" TEXT="XOR Term&#xa;(TTFTAObject.IsTypeXOR)">
<node CREATED="1232278927070" ID="ID_212184748" MODIFIED="1232282696131" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279554990" ID="ID_1722172551" MODIFIED="1232282696131" POSITION="right" STYLE="bubble" TEXT="NOT Term&#xa;(TTFTAObject.IsTypeNOT)">
<node CREATED="1232278927070" ID="ID_1026764943" MODIFIED="1232282696138" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279080154" ID="ID_481535011" MODIFIED="1232282831266" POSITION="right" STYLE="bubble" TEXT="AND Term">
<icon BUILTIN="help"/>
<node CREATED="1232279626963" ID="ID_1981020158" MODIFIED="1232282821143" STYLE="bubble" TEXT="Negated AND Term (NAT)&#xa;(TTFTAObject.IsNegatedANDTerm)">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_1040428779" MODIFIED="1232282696145" STYLE="bubble" TEXT="do nothing"/>
<node CREATED="1232280396321" ID="ID_1614376752" MODIFIED="1232282696146" STYLE="bubble" TEXT="separated as easy to check"/>
</node>
<node CREATED="1232279652381" ID="ID_1851966147" MODIFIED="1232282821136" STYLE="bubble" TEXT="one or more operands are negated&#xa;(check TTFTAObject.IsNegated)">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_1096228207" MODIFIED="1232282696152" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232278942490" ID="ID_159001782" MODIFIED="1232282696152" STYLE="bubble" TEXT="Basic AND Term (BAT)&#xa;(TTFTAObject.IsBasicANDTerm)">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232280133339" ID="ID_1584704559" MODIFIED="1232282696158" STYLE="bubble" TEXT="if flag &quot;alsoBasics&quot; is set then">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232278999209" ID="ID_1035002355" MODIFIED="1232282696158" STYLE="bubble" TEXT="if more than two operands:&#xa;split into two operands (using ANDSplit)">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232279017130" ID="ID_426484821" MODIFIED="1232282696166" STYLE="bubble" TEXT="Transform according to law of completeness">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
<node CREATED="1232280133339" ID="ID_1116805443" MODIFIED="1232282696166" STYLE="bubble" TEXT="if flag &quot;alsoBasics&quot; is not set then">
<node CREATED="1232278927070" ID="ID_1059363111" MODIFIED="1232282696166" STYLE="bubble" TEXT="do nothing"/>
</node>
</node>
<node CREATED="1232280377407" ID="ID_461001348" MODIFIED="1232282696167" STYLE="bubble" TEXT="AND Term with non-basic non-negated events">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232278999209" ID="ID_813306124" MODIFIED="1232282696167" STYLE="bubble" TEXT="if more than two operands:&#xa;split into two operands (using ANDSplit)">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232279017130" ID="ID_995859436" MODIFIED="1232282696172" STYLE="bubble" TEXT="Transform according to law of completeness">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
</node>
</node>
</map>
