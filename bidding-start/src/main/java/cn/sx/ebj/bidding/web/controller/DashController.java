package cn.sx.ebj.bidding.web.controller;

import cn.sx.ebj.bidding.core.annotations.SysLog;
import cn.sx.ebj.bidding.core.base.IController;
import cn.sx.ebj.bidding.core.base.Result;
import cn.sx.ebj.bidding.core.enums.ModuleType;
import cn.sx.ebj.bidding.core.enums.OperType;
import cn.sx.ebj.bidding.core.utils.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dash")
public class DashController extends IController {


    @GetMapping(value = "/board")
    @SysLog(module = ModuleType.CGGL, func = "index", desc = "仪表盘默认数据", type = OperType.QUERY)
    public Result<String> index() {

        return Result.error("请求错误");
    }

    @GetMapping("/test")
    @ResponseBody
    public Result<String> getIndex() {
        Page<?> d = Page.init();
        d.setTotalRecord(65);
        return Result.ok(d.getTotalPage() + "");
    }

}
