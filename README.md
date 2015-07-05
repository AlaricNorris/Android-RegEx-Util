# Android-RegEx-Util-
此类提供日常开发中常用的正则验证函数

此类提供日常开发中常用的正则验证函数，比如：邮箱、手机号、电话号码、身份证号码、日期、数字、小数、URL、IP地址等。使用Pattern对象的matches方法进行整个字符匹配，调用该方法相当于： 
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
每个正则可能还有待优化的地方，您如有更好的方式实现某一个功能的验证，欢迎提出来大家一起讨论。 
