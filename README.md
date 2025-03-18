# 智能协同云图库后端开发日志
在线demo预览地址：[demo](http://http://106.53.170.105/ "点击进入羡慕预览")

## 技术栈
- **后端框架**: Spring Boot, MyBatis Plus
- **数据库**: MySQL, Redis
- **对象存储**: 腾讯云 COS
- **安全**: JWT 认证, RBAC 权限控制
- **API 文档**: Swagger

# Version1.0
- 公共图库的开发

# Version2.0
> 进一步对系统的空间模块进行细分，将图库分为私有空间和公共空间
### 新增功能
- 用户可以自己创建私有空间
- 引入私有空间的权限控制
- 引入空间级别的概念(普通版、专业版、旗舰版)，后续可能会引入计费功能
- 对上传图片进行限额控制

## Version2.1
对图片搜索功能进行优化：
- 新增图片基础属性搜索功能：提供多种搜索维度，将搜索维度按照优先级进行排序
- 以图搜图功能：用户可以使用一张图片来搜索相似的图片
- 图片搜索服务（门面模式）：提供一个统一的接口简化多个接口的调用。
- 颜色搜索：根据图片的颜色搜索主色调最相似的图片
- 图片分享：用户可以分享图片到其他用户
- 图片批量管理：用户可以对私有空间内的图片进行批量修改，包括批量修改信息及批量重命名

## Version2.2
- 新增AI扩图功能：引入阿里云百炼大模型

## Version3.0
- 团队空间设计，创建团队共享空间（类似企业云盘）
- 引入RBAC权限控制，仅特定角色的成员可以访问或操作团队空间内的图片
