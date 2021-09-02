import { NgModule } from '@angular/core';
import { CdsConfig, CdsModule } from "@spartacus/cds";
import { provideConfig } from "@spartacus/core";

@NgModule({
  declarations: [],
  imports: [
    CdsModule.forRoot()
  ],
  providers: [provideConfig(<CdsConfig>{
    cds: {
      tenant: 'htp741331813',
      baseUrl: 'https://htp741331813.us.context.cloud.sap',
      endpoints: {
        strategyProducts: '/strategy/${tenant}/strategies/${strategyId}/products',
      },
      merchandising: {
        defaultCarouselViewportThreshold: 80,
      },
    },
  }),
  provideConfig(<CdsConfig>{
    cds: {
      profileTag: {
        javascriptUrl:
          'https://tag.static.us.context.cloud.sap/js/profile-tag.js',
        configUrl:
          'https://tag.static.us.context.cloud.sap/config/9a0e2c40-88cf-11eb-9074-2ff029ccb35e',
        allowInsecureCookies: true,
      },
    },
  })
  ]
})
export class CdsFeatureModule { }
