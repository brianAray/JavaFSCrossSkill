import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ParentComponentComponent } from './components/parent-component/parent-component.component';
import { ChildComponentComponent } from './components/child-component/child-component.component';
import { BlogPostListComponentComponent } from './components/blog-post-list-component/blog-post-list-component.component';
import { BlogPostDetailsComponentComponent } from './components/blog-post-details-component/blog-post-details-component.component';
import { ServiceExampleComponent } from './components/service-example/service-example.component';
import { FormsModule } from '@angular/forms';
import { PipesExampleComponent } from './components/pipes-example/pipes-example.component';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponentComponent,
    ChildComponentComponent,
    BlogPostListComponentComponent,
    BlogPostDetailsComponentComponent,
    ServiceExampleComponent,
    PipesExampleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
