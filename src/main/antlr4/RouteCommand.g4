grammar RouteCommand;

@header{
package com.training.fnparser.antlr4.gen;
}

route: 'route' add_or_del net_or_host ip_address (netmask)? gateway_ip;

add_or_del
    : 'add'     # addCmd
    | 'del'     # delCmd
    ;

net_or_host
    : '-net'    # netAddress
    | '-host'   # hostAddress
    ;

ip_address
    : IP        # ipAddress
    ;

netmask
    : MASK IP   # netmaskAddress
    ;

gateway_ip
    : GW IP     # gwAddress
    ;

IP
    : OCTET_IP DOT OCTET_IP DOT OCTET_IP DOT OCTET_IP
    ;

OCTET_IP
    : DIGIT DIGIT DIGIT
    | DIGIT DIGIT
    | DIGIT
    ;

fragment DOT: '.';
fragment DIGIT: [0-9];
MASK: 'netmask';
GW: 'gw';
WS: [ \t]+ -> skip;
