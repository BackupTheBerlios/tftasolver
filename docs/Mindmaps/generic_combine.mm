<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1232278495091" ID="ID_217096451" MODIFIED="1232295674553" STYLE="bubble" TEXT="GenericCombine: Boolean A-Law in TFTA logic&#xa;(flatten nested terms of commutative operators&#xa;i.e. AND, OR, XOR, SAND)">
<node CREATED="1232287082499" ID="ID_454728814" MODIFIED="1232292050309" POSITION="right" TEXT="INFO">
<icon BUILTIN="idea"/>
<node CREATED="1232286713198" ID="ID_1664829002" MODIFIED="1232287169345" TEXT="Boolean law:&#xa;AND[ a, AND[ b,c ] ] = AND[ a,b,c ] = AND[ AND[ a,b ],c ]">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1232286791836" ID="ID_182876542" MODIFIED="1232287169363" TEXT="the boolean version is not always valid in TFTA, &#xa;esp. in combination with negated terms">
<icon BUILTIN="idea"/>
</node>
<node CREATED="1232286856268" ID="ID_596855464" MODIFIED="1232287169357" TEXT="in TFTA temporal logic:&#xa;AND[ NOT[a], AND[ b,c ] ] &lt;&gt; AND[ NOT[a],b,c ] = AND[ AND[ NOT[a],b ],c ]">
<icon BUILTIN="idea"/>
</node>
</node>
<node CREATED="1232279080154" ID="ID_481535011" MODIFIED="1232292235944" POSITION="right" STYLE="bubble" TEXT="AND Term">
<icon BUILTIN="help"/>
<node CREATED="1232278942490" ID="ID_159001782" MODIFIED="1232292055751" STYLE="bubble" TEXT="Basic AND Term (BAT)&#xa;(TTFTAObject.IsBasicANDTerm)">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_1064637170" MODIFIED="1232295739103" STYLE="bubble" TEXT="do nothing&#xa;(no nested terms)"/>
<node CREATED="1232280396321" ID="ID_257770396" MODIFIED="1232283296647" STYLE="bubble" TEXT="separated as easy to check">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1232279626963" ID="ID_1981020158" MODIFIED="1232282821143" STYLE="bubble" TEXT="Negated AND Term (NAT)&#xa;(TTFTAObject.IsNegatedANDTerm)">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_1406285552" MODIFIED="1232295753244" STYLE="bubble" TEXT="do nothing&#xa;(no nested terms)"/>
<node CREATED="1232280396321" ID="ID_511388832" MODIFIED="1232283296647" STYLE="bubble" TEXT="separated as easy to check">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1232280377407" ID="ID_461001348" MODIFIED="1232295878461" STYLE="bubble" TEXT="AND Term with exclusively negated &#xa;operands and one or more NATs">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232279017130" ID="ID_995859436" MODIFIED="1232295914842" STYLE="bubble" TEXT="Flatten NATs into main term">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
<node CREATED="1232280377407" ID="ID_250854560" MODIFIED="1232296445067" STYLE="bubble" TEXT="AND Term with exclusively&#xa;non-negated operands ">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232296172869" ID="ID_1184996975" MODIFIED="1232296495920" TEXT="one or more operands of type AND which &#xa;themselves are without negated operands.">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232296481614" ID="ID_1572520792" MODIFIED="1232296495919" TEXT="flatten term">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
<node CREATED="1232279626963" ID="ID_1570060791" MODIFIED="1232296582663" STYLE="bubble" TEXT="at least one of the operands of&#xa;type AND has itself negated operands">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_114728925" MODIFIED="1232296591530" STYLE="bubble" TEXT="do nothing"/>
</node>
</node>
<node CREATED="1232296307462" ID="ID_143904759" MODIFIED="1232299062362" TEXT="Exactly one negated and &#xa;one non-negated operand">
<icon BUILTIN="help"/>
<node CREATED="1232278927070" ID="ID_1305912220" MODIFIED="1232282696119" STYLE="bubble" TEXT="do nothing"/>
<node CREATED="1232280396321" ID="ID_449123361" MODIFIED="1232296389688" STYLE="bubble" TEXT="even if the non-negated operand&#xa;is itself an AND!">
<icon BUILTIN="idea"/>
</node>
</node>
<node CREATED="1232296307462" ID="ID_581068149" MODIFIED="1232299090772" TEXT="More than one negated and / or&#xa;more than one non-negated operand">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232278927070" ID="ID_43980274" MODIFIED="1232299049317" STYLE="bubble" TEXT="call ANDMixedSplit">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232280396321" ID="ID_515131931" MODIFIED="1232299036868" STYLE="bubble" TEXT="combines all the negated operands into&#xa;one and all the non-negated operands&#xa;into another term">
<icon BUILTIN="idea"/>
</node>
</node>
</node>
<node CREATED="1232278899857" ID="ID_135624097" MODIFIED="1232287655295" POSITION="right" STYLE="bubble" TEXT="Basic Event&#xa;(TTFTAObject.IsBasicEvent)">
<node CREATED="1232278927070" ID="ID_1247686613" MODIFIED="1232282696105" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279093505" ID="ID_885914295" MODIFIED="1232291793574" POSITION="right" STYLE="bubble" TEXT="SAND Term&#xa;(TTFTAObject.IsTypeSAND)">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232291478960" ID="ID_4845989" MODIFIED="1232291877663" TEXT="if term has one or more operands&#xa;of type SAND, then flatten term">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232291603576" ID="ID_33094989" MODIFIED="1232291620173" TEXT="regardless of negated or non-negated operands">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1232279093505" ID="ID_1357048076" MODIFIED="1232282696111" POSITION="right" STYLE="bubble" TEXT="PAND Term&#xa;(TTFTAObject.IsTypePAND)">
<node CREATED="1232278927070" ID="ID_192855482" MODIFIED="1232282696119" STYLE="bubble" TEXT="do nothing"/>
</node>
<node CREATED="1232279544201" ID="ID_1148144023" MODIFIED="1232291793570" POSITION="right" STYLE="bubble" TEXT="OR Term&#xa;(TTFTAObject.IsTypeOR)">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232291478960" ID="ID_508795416" MODIFIED="1232291909658" TEXT="if term has one or more operands&#xa;of type OR, then flatten term">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232291603576" ID="ID_1053093177" MODIFIED="1232291620173" TEXT="regardless of negated or non-negated operands">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1232279550059" ID="ID_1444395368" MODIFIED="1232291793565" POSITION="right" STYLE="bubble" TEXT="XOR Term&#xa;(TTFTAObject.IsTypeXOR)">
<icon BUILTIN="messagebox_warning"/>
<node CREATED="1232291478960" ID="ID_337727853" MODIFIED="1232291934123" TEXT="if term has one or more operands&#xa;of type XOR, then flatten term">
<icon BUILTIN="messagebox_warning"/>
</node>
<node CREATED="1232291603576" ID="ID_171017175" MODIFIED="1232291620173" TEXT="regardless of negated or non-negated operands">
<icon BUILTIN="info"/>
</node>
</node>
<node CREATED="1232279554990" ID="ID_1722172551" MODIFIED="1232282696131" POSITION="right" STYLE="bubble" TEXT="NOT Term&#xa;(TTFTAObject.IsTypeNOT)">
<node CREATED="1232278927070" ID="ID_1026764943" MODIFIED="1232282696138" STYLE="bubble" TEXT="do nothing"/>
</node>
</node>
</map>
