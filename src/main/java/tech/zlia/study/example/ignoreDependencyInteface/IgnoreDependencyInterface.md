### 描述
论证BeanFactory#IgnoreDependencyInteface方法的使用，表示自动装配时忽略指定的依赖接口，也就是说IgnoreImpl依赖Car，而在IgnoreProcessor中调用了
BeanFactory#IngoreDependencyInteface(IgnoreInterface.class)，说明要忽略Car依赖，判断的依据是通过IgnoreInterface中的setCar方法的入参与依赖Car
是相同的参数类型，因为通常自动装配都需要调用setXXX，所以当调用该方法时会进行判断，如果同IgnoreInterface中的方法是一样的入参类型则忽略.