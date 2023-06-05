import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SampleComponent } from './sample/sample.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { FormsModule } from '@angular/forms';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { NgmodelExampleComponent } from './ngmodel-example/ngmodel-example.component';

@NgModule({
  declarations: [
    AppComponent,
    SampleComponent,
    DatabindingComponent,
    StructuralDirectivesComponent,
    AttributeDirectivesComponent,
    NgmodelExampleComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
